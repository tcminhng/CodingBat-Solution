public boolean closeFar(int a, int b, int c) {
  if (isClose(a, b)) {
    // If b is close, c must be far from both a and b
    return Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2;
  } else if (isClose(a, c)) {
    // If c is close, b must be far from both a and c
    return Math.abs(a - b) >= 2 && Math.abs(c - b) >= 2;
  }
  
  return false; // Neither b nor c was close to a
}

public boolean isClose(int x, int y) {
  return Math.abs(x - y) <= 1;
}
