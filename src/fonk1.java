
import java.util.Scanner;

public class fonk1 {

    public static void selamla() {
        System.out.println("merhaba nasılsınız");
        System.out.println("selamlar.....");
    }

    public static void faktoriyelHesapla() {
        Scanner input = new Scanner(System.in);

        int faktoriyel = 1;
        System.out.println("faktöriyeli alınması istediğiniz sayıyı giriniz");
        int sayi = input.nextInt();

        while (sayi > 0) {
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("girdiğiniz sayısının faktöriyeli : " + faktoriyel);

    }

    public static void main(String[] args) {
        selamla();
        faktoriyelHesapla();
    }
}
