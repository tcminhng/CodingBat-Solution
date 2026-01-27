public String stringSplosion(String str) {
  String cutStr = "";
  
  for(int i=0; i<str.length(); i++){
    cutStr += str.substring(0,i+1);
  }
  
  return cutStr;
}
