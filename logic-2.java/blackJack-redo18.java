import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

class ClimateZone{
    // Instance
    private ArrayList<City> cityList;

    // Default Constructor
    public ClimateZone(){
        this.cityList = new ArrayList<City>();
    }

    // Overloaded Constructor
    public ClimateZone(String fileName){
        this.cityList = new ArrayList<City>();

        try{
            FileInputStream file = new FileInputStream(fileName);
            Scanner fileScanner = new Scanner(file);

            while(fileScanner.hasNext()){
                String name = fileScanner.next();
                String state = fileScanner.next();
                double lowTemp = fileScanner.nextDouble();
                double highTemp = fileScanner.nextDouble();

                City newCity = new City(name, state, lowTemp, highTemp);
                this.cityList.add(newCity);
            }
            fileScanner.close();
        }
        catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Methods
    public void addCity(String name, String state, double highTemp, double lowTemp){
        City newCity = new City(name, state, highTemp, lowTemp);
        cityList.add(newCity);
    }

    public int getCityCount(){
        int numCity = this.cityList.size();
        return numCity;
    }

    public City getCityByName(String name, String state){
        for(City c : cityList){
            if(c.getName().equals(name) && c.getState().equals(state)){
                return c;
            }
        }
        return null;
    }

    public void printHottestCities(){
        City hottest = null;
        City secondHottest = null;

        for(City c : cityList){
            if(hottest == null || c.getHighTemp() > hottest.getHighTemp()){
                secondHottest = hottest;
                hottest = c;
            }
            else if(secondHottest == null || c.getHighTemp() > secondHottest.getHighTemp()){
                secondHottest = c;
            }
        }

        if(hottest != null){
            hottest.printInfo();
        }
        if(secondHottest != null){
            secondHottest.printInfo();
        }
    }

    public void printColdestCitites(){
        City coldest = null;
        City secondColdest = null;

        for(City c : cityList){
            if(coldest == null || c.getLowTemp() < coldest.getLowTemp()){
                secondColdest = coldest;
                coldest = c;
            }
            else if(secondColdest == null || c.getLowTemp() < secondColdest.getLowTemp()){
                secondColdest = c;
            }
        }

        if(coldest != null){
            coldest.printInfo();
        }
        if(secondColdest != null){
            secondColdest.printInfo();
        }
    }

    public void printAllCitites(){
        for(City c : cityList){
            c.printInfo();
        }
    }
}
