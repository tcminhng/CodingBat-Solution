public boolean evenlySpaced(int a, int b, int c) {
  int small = Math.min(a, Math.min(b,c));
  int big = Math.max(a, Math.max(b,c));
  
  int medium = (a+b+c) - small - big;
  
  if(Math.abs(small-medium) == Math.abs(medium - big)) return true;
  
  return false;
}
