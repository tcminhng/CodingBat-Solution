public String middleThree(String str) {
  if(str.length() < 4){
    return str;
  }
  
  int halfStr = str.length() / 2;
  
  String result = str.substring(halfStr-1, halfStr+2);
  
  return result;
}
