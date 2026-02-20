public int[] swapEnds(int[] nums) {
  if(nums.length < 2){
    return nums;
  }
  else{
    int first = nums[0];
    nums[0] = nums[nums.length-1];
    nums[nums.length-1] = first;
    
    return nums;
  }
}
