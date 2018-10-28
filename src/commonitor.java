
public class commonitor {

    private int model;
    private int yuva_sayisi;
    private String isletim_sistemi;
    private comresulotion resulotion;

    public commonitor(int model, int yuva_sayisi, String isletim_sistemi, comresulotion resulotion) {
        this.model = model;
        this.yuva_sayisi = yuva_sayisi;
        this.isletim_sistemi = isletim_sistemi;
        this.resulotion = resulotion;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getYuva_sayisi() {
        return yuva_sayisi;
    }

    public void setYuva_sayisi(int yuva_sayisi) {
        this.yuva_sayisi = yuva_sayisi;
    }

    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }

    public comresulotion getResulotion() {
        return resulotion;
    }

    public void setResulotion(comresulotion resulotion) {
        this.resulotion = resulotion;
    }
    
    public void ekrankapat(){
        System.out.println("ekran kapatılıyor");
    }
}
