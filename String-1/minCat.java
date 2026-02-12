public String minCat(String a, String b) {
  String result = "";
  if(a.length() > b.length()){
    String aExtract = a.substring(a.length()-b.length());
    return result = aExtract + b;
  }
  else if(a.length() < b.length()){
    String bExtract = b.substring(b.length()-a.length());
    return result = a + bExtract;
  }
  else{
    return result = a+b;
  }
}
