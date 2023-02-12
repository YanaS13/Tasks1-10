import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scan.nextInt();
        boolean num = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                num = false;
                break;
            }

        }
        if (num) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число составное");
        }

    }
}