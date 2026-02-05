public String makeOutWord(String out, String word) {
  String bracket1 = out.substring(0,2);
  String bracket2 = out.substring(2,4);
  
  return bracket1 + word + bracket2;
}
