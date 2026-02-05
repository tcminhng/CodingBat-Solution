public String extraEnd(String str) {
  String result = "";
  
  if(str.length() < 3){
    result = str+str+str;
  }
  else{
    String last2 = str.substring(str.length()-2, str.length());
    result = last2+last2+last2;
  }
  
  return result;
}
