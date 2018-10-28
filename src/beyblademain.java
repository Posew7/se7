
import java.util.Scanner;

public class beyblademain {

    public static void main(String[] args) {

        System.out.println("beyblade oyununa hoş geldiniz\n"
                + "çıkmak için q'ya basınız");
        System.out.println("");
        System.err.println("*******************");
        System.out.println("");

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("istediğiniz beyblade ismini giriniz");
            String islem = input.nextLine();

            if (islem.equals("q")) {
                System.out.println("programdan çıkılıyor..");
                break;
            } else {
                beybladefabrika fabrika = new beybladefabrika();

                beyblade b = fabrika.beybladeuret(islem);
                if (b == null) {
                    System.out.println("böyle bir beyblade yok\n"
                            + "tekrar deneyiniz");
                } else {

                    b.listele();
                    b.saldir();
                    b.kutsalcanavariortayacikar();
                }

            }
        }
    }
}
