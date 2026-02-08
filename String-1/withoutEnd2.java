public String withouEnd2(String str) {
  if(str.length() < 2){
    return "";
  }
  
  String result = str.substring(1, str.length()-1);
  
  return result;
}
