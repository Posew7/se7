
import java.util.ArrayList;
import java.util.Scanner;

public class sarkicimain {

    private static Scanner input = new Scanner(System.in);
    private static sarkici sarkici = new sarkici();
    private static ArrayList<String> sarkici_listesi = new ArrayList<String>();

    public static void islemleri_bastir() {
        System.out.println("1. şarkıcıları listele\n"
                + "2. şarkıcı ekle\n"
                + "3. şarkıcı güncelle\n"
                + "4. şarkıcı sil\n"
                + "5. şarkıcı ara\n"
                + "6. uygulamadan çık");
    }

    public static void main(String[] args) {

        System.out.println("şarkıcı uygulamasına hoşgeldiniz");
        islemleri_bastir();
        boolean cikis = false;
        int islem;
        while (!cikis) {
            System.out.println("bir işlem seçiniz");
            islem = input.nextInt();
            input.nextLine();

            if (islem == 6) {
                System.out.println("uygulamadan çıkılıyor");
                cikis = true;
            } else if (islem == 1) {
                
                    sarkici.sarkicilar_listele(sarkici_listesi);
                
            } else if (islem == 2) {
                System.out.println("eklemek istediğiniz şarkıcı ismini giriniz");
                String sarkici_ismi = input.nextLine();
                sarkici.sarkici_ekle(sarkici_listesi, sarkici_ismi);
            } else if (islem == 3) {
                System.out.println("güncellemek istediğiniz şarkıcının ismini giriniz");
                String sarkici_ismi = input.nextLine();
                System.out.println("kaçıncı sırada olduğunu giriniz");
                int pozisyon = input.nextInt();
                input.nextLine();
                sarkici.sarkici_guncelle(sarkici_listesi, sarkici_ismi, pozisyon - 1);
            } else if (islem == 4) {
                System.out.println("silmek isteidğiniz şarkıcının pozisyonunu giriniz");
                int pozisyon = input.nextInt();
                input.nextLine();
                sarkici.sarkici_sil(sarkici_listesi, pozisyon - 1);

            } else if (islem == 5) {
                System.out.println("şarkıcının ismini giriniz");
                String sarkici_ismi = input.nextLine();
                sarkici.sarkici_ara(sarkici_ismi, sarkici_listesi);
            } else {
                System.out.println("böyle bir seçenek yok");
            }
            
        }

    }
}
