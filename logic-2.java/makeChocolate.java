public int makeChocolate(int small, int big, int goal) {
  int bigNeeded = goal / 5;
  
  int use = Math.min(big, bigNeeded);
  
  int remainAfterBig = goal - (use * 5);
  
  if(small >= remainAfterBig) return remainAfterBig;
  
  else{
    return -1;
  }
}
