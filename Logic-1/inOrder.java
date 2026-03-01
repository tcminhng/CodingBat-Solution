public boolean inOrder(int a, int b, int c, boolean bOk) {
  if(b > a && c > b) return true;
  
  if(bOk && c > b) return true;
  
  return false;
}
