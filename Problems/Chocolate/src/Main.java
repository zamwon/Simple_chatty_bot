import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenghtN = scanner.nextInt();
        int widthM = scanner.nextInt();
        int picesK = scanner.nextInt();

        if (picesK > widthM * lenghtN) {
            System.out.println("NO");
        } else {
            if (picesK % lenghtN == 0 || picesK % widthM == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}