
public class icalisan {

    private int id;
    private String isim;
    private String soyad;

    public icalisan(int id, String isim, String soyad) {
        this.id = id;
        this.isim = isim;
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void listele() {
        System.out.println("id : " + id);
        System.out.println("isim : " + isim);
        System.out.println("soyad : " + soyad);
    }
}
