public int roundSum(int a, int b, int c) {
  int sum = round10(a) + round10(b) + round10(c);
  
  return sum;
}

public int round10(int num){
  if(num%10 >= 5){
    int roundUp = (num/10) * 10;
    return roundUp + 10;
  }
  
  else{
    if(num < 10) return 0;
    
    else{
      int roundDown = (num/10) * 10;
      return roundDown;
    }
  }
}
