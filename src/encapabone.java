
public class encapabone {

    private String isim;
    private int bakiye = 120;
    private String sehir;

    public encapabone(String isim, int bakiye, String sehir) {
        this.isim = isim;
        if (bakiye >= 0 && bakiye <= 120) {
            this.bakiye = bakiye;
        }
        this.sehir = sehir;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public void listele() {
        System.out.println("isim : " + isim + "\n"
                + "bakiye : " + bakiye + "\n"
                + "şehir : " + sehir);
    }

    public void kredial(int miktar) {
        if ((bakiye += miktar) >= 120) {
            bakiye = 120;
        } else {
            bakiye += miktar;
        }
    }
}
