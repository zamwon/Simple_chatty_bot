import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();
        switch (shape) {
            case "triangle":
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                double s = ((double) a + b + c) / 2;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(area);
                break;
            case "rectangle":
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                System.out.println((double) y * x);
                break;
            case "circle":
                int r = scanner.nextInt();
                double field = 3.14 * r * r;
                System.out.println(field);
                break;
            default:
        }
    }
}