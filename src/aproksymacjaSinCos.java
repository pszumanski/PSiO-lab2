public class aproksymacjaSinCos {
    public static void main(String[] args) {
        // x oznacza kąt dla którego obliczamy sin(x) i cos(x) w jednostce PI rad
        double x = 0.5 * Math.PI;
        // n oznacza dokładność aproksymacji funkcji sin(x) i cos(x)
        int n = 100000;

        System.out.println("Dla x = " + x / Math.PI + "π rad, " + "Sin(x) = " + SinX(x, n) + " Cos(x) = " + CosX(x, n));
        // System.out.println("Dla x = " + x + "rad, " + "Sin(x) = " + SinX(x, n) + " Cos(x) = " + CosX(x, n));
    }

    public static double SinX(double x, int n) {
        // Suma początkowa jest równa pierwszemu wyrazowi ciągu
        double suma = x;
        // 1 wyraz ciągu == x
        double temp = x;

        for (int i = 1; i < n; i++) {
            temp *= (-1.0) * x * x / (2 * i * (2 * i + 1));
            suma += temp;
        }

        return suma;
    }

    public static double CosX(double x, int n) {
        // Suma początkowa jest równa pierwszemu wyrazowi ciągu
        double suma = 1;
        // 1 wyraz ciągu == 1
        double temp = 1;

        // Każdy kolejny element zmienia znak, jest pomnożony przez x^2 i podzielony przez (2 * i) and (2 * i - 1)
        for (int i = 1; i < n; i++) {
            temp *= (-1.0) * x * x / (i * 2 * (2 * i - 1));
            suma += temp;
        }

        return suma;
    }
}
