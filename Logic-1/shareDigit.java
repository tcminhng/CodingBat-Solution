public boolean shareDigit(int a, int b) {
  int left1 = a/10;
  int left2 = b/10;
  int right1 = a%10;
  int right2 = b%10;
  
  if(left1==left2 || left1==right2) return true;
  if(right1==left2 || right1==right2) return true;

  return false;
}
