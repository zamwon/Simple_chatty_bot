import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String napis1 = scanner.nextLine();
        String napis2 = scanner.nextLine();
        String napI = napis1.trim();
        String napII = napis2.trim();
        Boolean rowne = napI.replace(" ", "").equals(napII.replace(" ", ""));
        System.out.println(rowne);
    }
}