public int maxTriple(int[] nums) {
  if(nums.length <= 1){
    return nums[0];
  }
  else{
    int first = nums[0];
    int last = nums[nums.length-1];
    int middle = nums[nums.length / 2];
    
    int largest = first;
    if(largest < last){
      largest = last;
    }
    if(largest < middle){
      largest = middle;
    }
    
    return largest;
  }
}
