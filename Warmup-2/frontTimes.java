public String frontTimes(String str, int n) {
  String result = "";
  String cut = "";
  
  if(str.length() >= 3){
    cut = str.substring(0,3);
  }
  else{
    cut = str;
  }
  
  for(int i = 0; i < n; i++){
    result += cut;
  }
  return result;
}
