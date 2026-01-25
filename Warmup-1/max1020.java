public int max1020(int a, int b) {
  if(b > a){
    int temp = a;
    a = b;
    b = temp;
  }
  
  if(10 <= a && a <= 20){
    return a;
  }
  if(10 <= b && b <= 20){
    return b;
  }
  return 0;
}
