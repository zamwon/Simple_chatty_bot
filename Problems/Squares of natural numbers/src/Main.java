import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howMany = scanner.nextInt();
        int wartosc = 1;
        int licznik = 1;

        while (wartosc <= howMany) {
            wartosc = (int) Math.pow(licznik, 2);
            if (wartosc > howMany) {
                break;
            }
            System.out.println(wartosc);
            licznik++;
        }
    }
}