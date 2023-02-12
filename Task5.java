import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите вес на Земле");
        int vE = scan.nextInt();
        double vM;
        vM = 0.17* vE;
        System.out.println("Вес на Луне составляет " + vM);
    }
}