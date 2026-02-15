public int[] rotateLeft3(int[] nums) {
  int nums0 = nums[0];
  
  nums[0] = nums[1];
  nums[1] = nums[2];
  nums[2] = nums0;
  
  return new int[] {nums[0],nums[1],nums[2]};
}
