
public class Intcalisan {

    private String isim;
    private int maas;
    private String departman;

    public Intcalisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public void calis() {
        System.out.println("çalışan çalışıyor");
    }

    public void departmandegis(String yeni_departman) {
        System.out.println("departman değiştiriliyor...");
        this.departman = yeni_departman;
        System.out.println("departman değiştirildi");
    }

    public void listele() {
        System.out.println("isim : " + this.isim);
        System.out.println("maaş : " + maas);
        System.out.println("departman : " + departman);
    }
}
