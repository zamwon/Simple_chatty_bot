import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howMuch = scanner.nextInt();
        int countPerfect = 0;
        int countFix = 0;
        int countReject = 0;
        for (int i = 0; i < howMuch; i++) {
            int part = scanner.nextInt();
            if (part == 1) {
                countFix++;
            } else if (part == -1) {
                countReject++;
            } else if (part == 0) {
                countPerfect++;
            }
        }
        System.out.println(countPerfect + " " + countFix + " " + countReject);

    }
}