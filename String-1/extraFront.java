public String extraFront(String str) {
  String result = "";
  
  if(str.length() < 2){
    return result = str+str+str;
  }
  else{
     String first2 = str.substring(0,2);
     return result = first2+first2+first2;
  } 
}
