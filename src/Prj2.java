
import java.util.Scanner;

public class Prj2 {

    public static int ebobBul(int a, int b) {

        int ebob = 1;

        for (int i = 2; i < a && i < b; i++) {
            if ((a % i == 0) & (b % i == 0)) {
                ebob = i;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz");
        int a = input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int b = input.nextInt();
        System.out.println("EBOB(" + a + "," + b + ") = " + ebobBul(a, b));

    }
}
