import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ileLiczb = scanner.nextInt();
        int max = 0;
        int i = 0;
        while (i < ileLiczb) {
            int liczba = scanner.nextInt();
            if (liczba % 4 == 0 && liczba > max) {
                max = liczba;
            }
            i++;
        }
        System.out.println(max);
    }
}
