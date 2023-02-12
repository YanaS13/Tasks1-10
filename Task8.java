import java.util.Scanner;
import java.util.Random;
public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        boolean count = true;
        char c = (char)(r.nextInt(26) + 'A');

        while (count) {
            System.out.println("Введите любую букву от A до Z");
            char cUs = scan.next().charAt(0);
            if (c < cUs) {
                System.out.println("You’re too high»");
                count = true;
            } else if (c > cUs) {
                System.out.println("You’re too low»");
                count = true;
            }
            if (c == cUs) {
                System.out.println("Right");
                count = false;
            }
        }
    }
}