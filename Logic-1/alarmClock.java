public String alarmClock(int day, boolean vacation) {
  if((1 <= day && day <= 5) && !vacation) return "7:00";
  if((day == 0 || day == 6) && !vacation) return "10:00";
  if((1 <= day && day <= 5) && vacation) return "10:00";
  return "off";
}
