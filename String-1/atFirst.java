public String atFirst(String str) {
  if(str.length() < 2 && str.length() > 0){
    return str + '@';
  }
  else if(str.length() == 0){
    return "@@";
  }
  else {
    String result = str.substring(0,2);
    return result;
  }
}
