import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        do {
            liczba = scanner.nextInt();
            if (liczba == 0) {
                break;
            }
        } while (liczba != 0);
    }
}