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
            System.out.println(liczba % 2 == 0 ? "even" : "odd");

        } while (liczba != 0);
    }
}