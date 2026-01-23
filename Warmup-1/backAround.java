public String backAround(String str) {
  if(str.length() <= 1){
    return str + str + str;
  }
  
  String lastChar = str.substring(str.length() - 1);
  
  return lastChar + str + lastChar;
}
