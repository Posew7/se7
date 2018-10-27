
import java.util.Scanner;

public class ATMlogin {

    public boolean girisKontrol(ATMhesap hesap) {

        Scanner input = new Scanner(System.in);

        System.out.println("kullanıcı adını giriniz");
        String kullanici_adi = input.nextLine();
        System.out.println("şifreyi giriniz");
        String sifre = input.nextLine();

        if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getSifre().equals(sifre)) {
            return true;
        } else {
            return false;
        }

    }
}
