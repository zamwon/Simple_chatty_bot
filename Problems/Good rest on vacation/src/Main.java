import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int dailyFood = scanner.nextInt();
        int flight = scanner.nextInt();
        int nightCost = scanner.nextInt();

        int sum = days * dailyFood + (days - 1) * nightCost + flight * 2;
        System.out.println(sum);

    }
}