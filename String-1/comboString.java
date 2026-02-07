public String comboString(String a, String b) {
  String result = "";
  
  if(a.length() < b.length()){
    result = a + b + a;
  }
  else{
    result = b + a + b;
  }
  
  return result;
}
