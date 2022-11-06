package Lessontwo;

public class ex3 {
  public static void main (int n) {
        int n = 1;
      System.out.println(isPowerOfTwo);
    }

    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < n; i++) {
        if (Math.pow(2,i) > n) return false;
        else if(Math.pow(2,i)==n) return true;
    }
        return false;
    }
}
