import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String napis = scanner.next();
        String napisNowy = napis.replace("a", "b");
        System.out.println(napisNowy);
    }
}