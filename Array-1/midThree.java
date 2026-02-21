public int[] midThree(int[] nums) {
  int middle = nums[nums.length / 2];
  int beforeMiddle = nums[(nums.length / 2)-1];
  int afterMiddle = nums[(nums.length / 2)+1];
  
  return new int[] {beforeMiddle, middle, afterMiddle};
}
