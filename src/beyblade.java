
public class beyblade {

    private String beybladeci;
    private int saldiri_gucu;
    private int donus_hizi;

    public beyblade(String beybladeci, int saldiri_gucu, int donus_hizi) {
        this.beybladeci = beybladeci;
        this.saldiri_gucu = saldiri_gucu;
        this.donus_hizi = donus_hizi;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getSaldiri_gucu() {
        return saldiri_gucu;
    }

    public void setSaldiri_gucu(int saldiri_gucu) {
        this.saldiri_gucu = saldiri_gucu;
    }

    public int getDonus_hizi() {
        return donus_hizi;
    }

    public void setDonus_hizi(int donus_hizi) {
        this.donus_hizi = donus_hizi;
    }

    public void listele() {
        System.out.println("beybladeci adı : " + beybladeci);
        System.out.println("saldırı gücü : " + saldiri_gucu);
        System.out.println("dönüş hızı : " + donus_hizi);

    }

    public void kutsalcanavariortayacikar() {
        System.out.println("bu beyblade'in kutsal canavarı bulunmamaktadır");
    }

    public void saldir() {
        System.out.println(beybladeci + " " + saldiri_gucu + " saldırı gücü " + donus_hizi + " dönüş hızı ile saldırıyor");
    }
}
