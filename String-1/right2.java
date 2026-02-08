public String right2(String str) {
  String result = str.substring(str.length()-2);
  String result2 = str.substring(0, str.length()-2);
  
  return result + result2;
}
