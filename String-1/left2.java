public String left2(String str) {
  String first2 = str.substring(0,2);
  String rest = str.substring(2);
  
  String result = rest+first2;
  
  return result;
}
