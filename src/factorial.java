public class factorial {
    public static void main(String[] args) {
        int x = 5;

        System.out.println(x + "! wynosi: " + silnia(x));
    }

    // Obliczamy silnię x! korzystając z zależności: x! == x * (x - 1)! oraz 1! == 1
    public static int silnia(int x) {
        // 1! == 1 oraz 0! == 1
        if (x == 1 || x == 0) {
            return 1;
        }
        return x * silnia(x - 1);
    }

//    public static int silnia(int x) {
//        // 1! == 1 oraz 0! == 1
//        int wynik = 1;
//
//        for (int i = 2; i <= x; i++) {
//            wynik *= i;
//        }
//        return wynik;
//    }
}
