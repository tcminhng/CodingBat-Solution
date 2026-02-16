public int sum2(int[] nums) {
  if(nums.length == 0){
    return 0;
  }
  
  if(nums.length >= 2){
    return nums[0] + nums[1];
  }
  else{
    return nums[0];
  }
}
