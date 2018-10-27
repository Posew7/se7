
public class ATMhesap {

    private String kullanici_adi;
    private String sifre;
    private int bakiye;
    private int miktar;

    public ATMhesap(String kullanici_adi, String sifre, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.sifre = sifre;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        if (bakiye < 0) {
            System.out.println("bakiye negatif değer alamaz");
        } else {
            this.bakiye = bakiye;
        }
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        if (miktar < 0) {
            System.out.println("miktar negatif değer alamaz");
        } else {
            this.miktar = miktar;
        }
    }

    public void yatir() {
        bakiye += miktar;
        System.out.println("yeni bakiyeniz : " + bakiye);
    }

    public void cek() {
        if (bakiye < miktar) {
            System.out.println("yeterli bakiyeniz yok\n"
                    + "bakiyeniz : " + bakiye);
        } else {
            bakiye -= miktar;
            System.out.println("yeni bakiyeniz : " + bakiye);
        }
    }
}
