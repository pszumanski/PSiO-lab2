public class power {
    public static void main(String[] args) {
        // x jest liczbą którą podnosimy do potęgi k
        int x = 5;
        int k = 3;

        // System.out.println(Math.pow(x, k));
        System.out.println(x + " do potęgi " + k + " wynosi: " + potega(x,k));
    }

    // Obliczamy x^k
    public static int potega(int x, int k) {
        // return (int) Math.pow(x, k);
        // x^1 == x
        int p = x;

        // x^0 == 1
        if (k == 0) {
            return 1;
        }
        // Wykonujemy (x * x) k razy
        while (k > 1) {
            p *= x;
            k--;
        }
        return p;
    }
}
