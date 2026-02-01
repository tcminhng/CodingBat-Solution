public String stringX(String str) {
  String result = "";
  
  for (int i = 0; i < str.length(); i++) {
    char current = str.charAt(i);
    
    if (i == 0 || i == str.length() - 1 || current != 'x') {
      result += current;
    }
  }
  
  return result;
}
