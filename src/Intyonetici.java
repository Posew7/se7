
public class Intyonetici extends Intcalisan {

    private int altındaki_eleman;

    public Intyonetici(String isim, int maas, String departman, int altındaki_eleman) {
        super(isim, maas, departman);
        this.altındaki_eleman = altındaki_eleman;
    }

    public void listele() {
        super.listele();
        System.out.println("altındaki eleman sayısı : " + altındaki_eleman);
    }

}
