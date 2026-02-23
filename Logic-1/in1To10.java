public boolean in1To10(int n, boolean outsideMode) {
  if(1 <= n && n <= 10 && !outsideMode) return true;
  if((n <= 1 || n >= 10) && outsideMode) return true;
  return false;
}
