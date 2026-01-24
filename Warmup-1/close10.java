public int close10(int a, int b) {
  int near101 = Math.abs(a - 10);
  int near102 = Math.abs(b - 10);
  
  if(near101 < near102){
    return a;
  }
  else if(near101 > near102){
    return b;
  }
  else{
    return 0;
  }
}
