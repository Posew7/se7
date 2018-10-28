
public class comkasa {

    private String model;
    private String renk;
    private int fiyat;

    public comkasa(String model, String renk, int fiyat) {
        this.model = model;
        this.renk = renk;
        this.fiyat = fiyat;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public void pcac(){
        System.out.println("bilgisayar açılıyor");
    }
}
