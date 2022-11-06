package Lessontwo;
public class exs2 {

    public static void main(String args[]) {
        double x = 2.00000;
        int n = 10;
        System.out.println(Math.pow(double x, int n));
        }
    public double myPow(double x, int n) {
        if (n < 0)
             return 1 / recursive(x, n);
            return recursive(x, n);
    }
    private double recursive(double x, int n) {
        if (n == 0) return 1;
    double pow_half = recursive(x, n / 2);
        return n % 2 == 0 ? pow_half * pow_half : pow_half * pow_half * x;
    }
}
