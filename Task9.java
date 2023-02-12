import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число a");
        float a = scan.nextFloat();
        System.out.println("Введите число b");
        float b = scan.nextFloat();
        System.out.println("Введите число c");
        float c = scan.nextFloat();
        double d, x1, x2;
        d = b*b - 4*a*c;
        if (d < 0) {
            System.out.println(" Корней нет ");
        } else if (d == 0) {
            x1 = (-b)/(2*a);
            System.out.println(" Один корень равный "+ x1);
        } else {
            x1 = (-b - Math.sqrt(d)) / (2*a);
            x2 = (-b + Math.sqrt(d)) / (2*a);
            System.out.println(" Первый корень равен "+ x1);
            System.out.println(" Второй корень равен " + x2);
        }
    }
}
