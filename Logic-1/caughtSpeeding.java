public int caughtSpeeding(int speed, boolean isBirthday) {
  if(speed <= 60 && !isBirthday) return 0;
  if(61 <= speed && speed <= 80 && !isBirthday) return 1;
  if(speed >= 81 && !isBirthday) return 2;
  
  if(speed <= 65 && isBirthday) return 0;
  if(66 <= speed && speed <= 85 && isBirthday) return 1;
  if(speed >= 86 && isBirthday) return 2;
  
  return 0;
}
