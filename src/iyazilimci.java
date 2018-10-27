
public class iyazilimci extends icalisan {

    private String diller;

    public iyazilimci(int id, String isim, String soyad, String diller) {
        super(id, isim, soyad);
        this.diller = diller;
    }

    public String getDiller() {
        return diller;
    }

    public void setDiller(String diller) {
        this.diller = diller;
    }

    public void formatAt(String isletim_sistemi) {
        System.out.println(isletim_sistemi + " yükleniyor..");
    }

    @Override
    public void listele() {
        super.listele();
        System.out.println("bildiği diller : " + diller);
    }

}
