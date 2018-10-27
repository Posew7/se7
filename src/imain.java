
import java.util.Scanner;

public class imain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String islemler = "1. yazılımcı işleri\n"
                + "2. yönetici işleri\n"
                + "çıkmak için q'ya basınız";

        System.err.println("********************");
        System.out.println(islemler);
        System.err.println("\n\n\n********************");

        while (true) {
            System.out.println("yapmak istediğiniz işlemi seçiniz");
            String secim = input.nextLine();

            if (secim.equals("q")) {
                System.out.println("program sonlandırıldı..");
                break;
            } else if (secim.equals("1")) {
                System.err.println("********************");
                System.out.println("1. format atma\n"
                        + "2. bilgileri listele\n"
                        + "çıkmak için q'ya basınız");
                System.err.println("********************");

                while (true) {
                    iyazilimci i = new iyazilimci(237, "posew7", "java", "java, phyton");
                    System.out.println("yapmak istediğiniz işlemi seçiniz");
                    String yazsecim = input.nextLine();
                    if (yazsecim.equals("q")) {
                        System.out.println("ana menüye dönüyorsunuz");
                        break;
                    } else if (yazsecim.equals("1")) {
                        System.out.println("hangi işletim sistemini kuracaksınız");
                        String sistem = input.nextLine();
                        i.formatAt(sistem);

                    } else if (yazsecim.equals("2")) {
                        i.listele();
                    } else {
                        System.out.println("yanlış bir tercih yaptınız");
                    }

                }
            } else if (secim.equals("2")) {

                iyonetici i = new iyonetici(237, "posew7", "java", 21);
                System.err.println("********************");
                System.out.println("1. zam yap\n"
                        + "2. bilgileri listele\n"
                        + "çıkmak için q'ya basınız");
                System.err.println("********************");

                while (true) {
                    System.out.println("yapmak istediğiniz işlemi seçin");
                    String yonsecim = input.nextLine();

                    if (yonsecim.equals("q")) {
                        System.out.println("ana menüye yönlendiriliyorsunuz");
                        break;
                    } else if (yonsecim.equals("1")) {
                        System.out.println("ne kadar zam yapmak istiyorsunuz");
                        int zam = input.nextInt();
                        i.zamyap(zam);
                        input.nextLine();
                    } else if (yonsecim.equals("2")) {
                        i.listele();
                    } else {
                        System.out.println("yanlış bir seçim yaptınız");
                    }

                }

            } else {
                System.out.println("yanlış bir seçim yaptınız tekrar deneyiniz");
            }

        }
    }
}
