import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int liczba;
        do {
            liczba = scanner.nextInt();
            counter++;
        } while (liczba != 0);
        System.out.println(counter - 1);
    }
}