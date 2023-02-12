import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a, b, c;
        a = n % 10;
        b = (n/10) % 10;
        c = (n/100) % 10;
        System.out.println("Сумма числа "+ n+" равна: "+(a+b+c));
    }
}