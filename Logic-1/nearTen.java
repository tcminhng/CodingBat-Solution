public boolean nearTen(int num) {
  if(0 <= num % 10 && num % 10 <= 2) return true;
  if(8 <= num % 10 && num % 10 <= 9) return true;
  return false;
}
