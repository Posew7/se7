
import java.util.Scanner;

public class Prj3 {

    public static int topla(int a, int b) {
        return a + b;
    }

    public static int topla(int a, int b, int c) {
        return a + b + c;
    }

    public static int carp(int a, int b, int c) {
        return a * b * c;
    }

    public static int carp(int a, int b) {
        return a * b;
    }

    public static int cikar(int a, int b) {
        return Math.abs(a - b);
    }

    public static double bol(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;

        String islemler = "1. Toplama İşlemi\n"
                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma İşlemi\n"
                + "4. Bölme İşlemi\n"
                + "çıkmak için q basınız";
        System.out.println("********************");
        System.out.println(islemler);
        System.out.println("********************");

        while (true) {
            System.out.println("işleminizi seçiniz");
            String islem = input.nextLine();
            if (islem.equals("q")) {
                System.out.println("çıkış yaptınız");
                break;
            } else if (islem.equals("1")) {
                System.out.println("kaç sayı ile işlem yapacaksınız (2 veya 3)");
                int sayikac = input.nextInt();
                if (sayikac == 2) {
                    System.out.println("birinci sayı :");
                    a = input.nextInt();
                    System.out.println("ikinci sayı :");
                    b = input.nextInt();
                    input.nextLine();
                    System.out.println("sonuç : " + topla(a, b));
                } else if (sayikac == 3) {
                    System.out.println("birinci sayı :");
                    a = input.nextInt();
                    System.out.println("ikinci sayı :");
                    b = input.nextInt();
                    System.out.println("üçüncü sayı :");
                    c = input.nextInt();
                    input.nextLine();
                    System.out.println("sonuç : " + topla(a, b, c));
                } else {
                    System.out.println("böyle bir metod bulunmamaktadır...");
                }
            } else if (islem.equals("3")) {
                System.out.println("kaç sayı ile işlem yapacaksınız (2 veya 3)");
                int sayikac = input.nextInt();
                if (sayikac == 2) {
                    System.out.println("birinci sayı :");
                    a = input.nextInt();
                    System.out.println("ikinci sayı :");
                    b = input.nextInt();
                    input.nextLine();
                    System.out.println("sonuç : " + carp(a, b));
                } else if (sayikac == 3) {
                    System.out.println("birinci sayı :");
                    a = input.nextInt();
                    System.out.println("ikinci sayı :");
                    b = input.nextInt();
                    System.out.println("üçüncü sayı :");
                    c = input.nextInt();
                    input.nextLine();
                    System.out.println("sonuç : " + carp(a, b, c));
                } else {
                    System.out.println("böyle bir metod bulunmamaktadır...");
                }
            } else if (islem.equals("2")) {
                System.out.println("birinci sayı :");
                a = input.nextInt();
                System.out.println("ikinci sayı :");
                b = input.nextInt();
                input.nextLine();
                System.out.println("sonuç : " + cikar(a, b));
            } else if (islem.equals("4")) {
                System.out.println("birinci sayı :");
                a = input.nextInt();
                System.out.println("ikinci sayı :");
                b = input.nextInt();
                input.nextLine();
                System.out.println("sonuç : " + bol(a, b));
            } else {
                input.nextLine();
                System.out.println("böyle bir seçenek bulunmamaktadır...");
            }
        }
    }
}
