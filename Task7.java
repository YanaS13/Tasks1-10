import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сколько членов последовательности Фибоначчи вывести от 2 до 100");
        int n = scan.nextInt();
        System.out.println( n + " членов последовательности Фибоначчи: ");
        int a = 0, b = 1, c;
        System.out.print("0 1");
        for (int i = 2; i <= n;i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }
}