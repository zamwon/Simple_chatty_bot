import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String napis = scanner.nextLine();
        Boolean prawda = napis.endsWith("burg");
        System.out.println(prawda);

    }
}