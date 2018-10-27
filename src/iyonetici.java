
public class iyonetici extends icalisan {

    private int sorumlu_kisi_sayisi;

    public iyonetici(int id, String isim, String soyad, int sorumlu_kisi_sayisi) {
        super(id, isim, soyad);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    public int getSorumlu_kisi_sayisi() {
        return sorumlu_kisi_sayisi;
    }

    public void setSorumlu_kisi_sayisi(int sorumlu_kisi_sayisi) {
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    public void zamyap(int zam_miktari) {
        System.out.println("personele " + zam_miktari + " lira zam yapıldı");
    }

    @Override
    public void listele() {
        super.listele();
        System.out.println("sorumlu olduğu personel sayısı : " + sorumlu_kisi_sayisi);

    }

}
