import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        int sum = 0;
        do {
            liczba = scanner.nextInt();
            sum += liczba;
            if (liczba == 0) {
                System.out.println(sum);
                break;
            }
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        } while (liczba != 0);

    }
}