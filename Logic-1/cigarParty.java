public boolean cigarParty(int cigars, boolean isWeekend) {
  if(40 <= cigars && cigars <= 60 && !isWeekend) return true;
  
  if(40 <= cigars && isWeekend) return true;
  
  return false;
}
