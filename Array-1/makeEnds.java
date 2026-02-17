public int[] makeEnds(int[] nums) {
  if(nums.length < 2){
    return new int[] {nums[0], nums[0]};
  }
  else{
    int firstNum = nums[0];
    int lastNum = nums[nums.length-1];
    
    return new int[] {firstNum, lastNum};
  }
}
