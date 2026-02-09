public String nTwice(String str, int n) {
  String result1 = str.substring(0,0+n);
  String result2 = str.substring(str.length()-n);
  
  return result1+result2;
}
