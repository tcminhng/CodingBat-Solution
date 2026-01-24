public int intMax(int a, int b, int c) {
  int maxNum;
  
  if(a > b && a > c){
    return maxNum = a;
  }
  
  if(b > a && b > c){
    return maxNum = b;
  }
  
  return maxNum = c;
}
