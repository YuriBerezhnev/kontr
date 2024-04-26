import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSum = 0;

        System.out.print("Введите число (0 для завершения): ");
        int number = scanner.nextInt();

        while (number != 0) {
            totalSum += number;
            System.out.print("Введите число (0 для завершения): ");
            number = scanner.nextInt();
        }

        System.out.println("Сумма последовательности: " + totalSum);
    }
}