public boolean loneTeen(int a, int b) {
  boolean aIsTeen = (13 <= a && a <= 19);
  boolean bIsTeen = (13 <= b && b <= 19);
  
  if((!aIsTeen && bIsTeen) || (aIsTeen && !bIsTeen)){
    return true;
  }
  return false;
}
