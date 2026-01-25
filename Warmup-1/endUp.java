public String endUp(String str) {
  if(str.length() < 3){
    return str.toUpperCase();
  }
  
  int cut = str.length() - 3;
  
  String back = str.substring(cut, str.length());
  String front = str.substring(0, cut);
  
  return front + back.toUpperCase();
}
