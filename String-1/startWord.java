public String startWord(String str, String word) {
  if(str.length() < word.length()){
    return "";
  }
  
  String strExtract = str.substring(1, word.length());
  String wordExtract = word.substring(1);
  
  if(strExtract.equals(wordExtract)){
    return str.substring(0, word.length());
  }
  
  return "";
}
