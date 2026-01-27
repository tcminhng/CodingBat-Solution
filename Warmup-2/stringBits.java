public String stringBits(String str) {
  String cutStr = "";
  
  for(int i=0; i<str.length(); i=i+2){
    cutStr += str.charAt(i);
  }
  
  return cutStr;
}
