public String nonStart(String a, String b) {
  String firstChar1 = a.substring(1, a.length());
  String firstChar2 = b.substring(1, b.length());
  
  String result = firstChar1 + firstChar2;
  
  return result;
}
