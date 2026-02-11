public String lastTwo(String str) {
  if(str.length() < 2){
    return str;
  }
  
  String secondLast = str.substring(str.length()-2, str.length()-1);
  String last = str.substring(str.length()-1);
  
  if(str.length() == 2){
    return last + secondLast;
  }
  else{
    String rest = str.substring(0, str.length() - 2);
    String result = rest + last + secondLast;
    return result;
  }
}
