public int sumLimit(int a, int b) {
  String num = String.valueOf(a+b);
  String aLen = String.valueOf(a);
  
  if(num.length() == aLen.length()) return a+b;
  else{
    return a;
  }
}
