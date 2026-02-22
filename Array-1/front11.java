public int[] front11(int[] a, int[] b) {
  int size = 0;
  
  if(a.length > 0){
    size++;
  }
  if(b.length > 0){
    size++;
  }
  
  int[] array = new int[size];
  int index = 0;
  
  if(a.length > 0){
    array[index] = a[0];
    index++;
  }
  if(b.length > 0){
    array[index] = b[0];
  }
  
  return array;
}
