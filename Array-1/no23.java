public boolean no23(int[] nums) {
  for(int n : nums){
    if(n == 2 || n == 3){
      return false;
    }
  }
  
  return true;
}
