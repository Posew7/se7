
import java.util.Scanner;

public class ATMatm {

    public void calis(ATMhesap hesap) {
        Scanner input = new Scanner(System.in);
        int hak = 3;

        System.out.println("Hoşgeldiniz");
        System.err.println("******************");
        ATMlogin login = new ATMlogin();

        while (true) {

            if (login.girisKontrol(hesap)) {
                System.out.println("giriş başarılı");
                break;
            } else {
                System.out.println("kullanıcı adı veya şifre hatalı");
                System.out.println("kalan hak :" + (hak - 1));
            }
            if (hak == 0) {
                System.out.println("3 kere yanlış giriş yaptınız\n"
                        + "sistem bloke oldu");
            }

        }

        String islemler = "1. para çekme\n"
                + "2. para yatırma\n"
                + "3. bakiye öğrenme\n"
                + "çıkmak için q basınız";
        System.err.println("**********************");
        System.out.println(islemler);

        while (true) {
            System.out.println("yapmak istediğiniz işlemi seçiniz");
            String islem = input.nextLine();
            if (islem.equals("3")) {
                System.out.println(hesap.getBakiye());
            } else if (islem.equals("q")) {
                break;
            } else if (islem.equals("2")) {
                System.out.println("yatırmak istediğiniz tutarı giriniz");
                hesap.setMiktar(input.nextInt());
                hesap.yatir();
                input.nextLine();
            } else if (islem.equals("1")) {
                System.out.println("çekmek istediğiniz tutarı giriniz");
                hesap.setMiktar(input.nextInt());
                hesap.cek();
                input.nextLine();
            } else {
                System.out.println("yanlış bir giriş yaptınız");
            }
        }
    }
}
