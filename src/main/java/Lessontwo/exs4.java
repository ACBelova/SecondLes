package Lessontwo;

public class exs4 {
    public static void main ( int n) ; {
        int n = 2;
        System.out.println(climbStairs( int n));
    }
    public int climbStairs(int n) {
    int pre = 1;
    int curr = 1;
    int temp = 0;
         for (int i = 1; i< n; i++){
        temp = curr;
        curr = temp+ pre;
        pre = temp;
        }
        return curr;
 }
}
