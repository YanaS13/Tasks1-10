import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scan.nextInt();
        int b = a;
        int c = 0;
        while (a > 0) {
            c = a % 10 + c * 10;
            a = a / 10;
        }
        if (b == c) {
            System.out.println("Число является палиндромом");
        } else {
            System.out.println("Число не является палиндромом");
        }
    }
}