public String frontTimes(String str, int n) {
  String result = "";
  
  if(str.length() < 3){
    for(int y=0; y<n; y++){
      result += str.substring(0, str.length());
    }
  }
  else{
    for(int i=0; i<n; i++){
    result += str.substring(0,3);
    }
  }
  
  return result;
}
