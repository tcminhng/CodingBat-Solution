public boolean squirrelPlay(int temp, boolean isSummer) {
  if(!isSummer && 60 <= temp && temp <= 90) return true;
  
  if(isSummer && 60 <= temp && temp <= 100) return true;
  
  return false;
}
