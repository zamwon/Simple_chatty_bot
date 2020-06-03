import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean warunekA = a > 0 && b < 1 && c < 1;
        boolean warunekB = a < 1 && b > 0 && c < 1;
        boolean warunekC = a < 1 && b < 1 && c > 0;
        System.out.println(warunekA || warunekB || warunekC);
    }
}