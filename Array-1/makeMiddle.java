public int[] makeMiddle(int[] nums) {
  int half = nums.length / 2;
  
  int first = nums[half-1];
  int second = nums[half];
  
  return new int[]{first,second};
}
