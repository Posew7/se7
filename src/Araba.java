
public class Araba {

    private String marka;
    private String motor;
    private String renk;
    private int kapi;
    private int model;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapi() {
        return kapi;
    }

    public void setKapi(int kapi) {
        if (kapi <= 0) {
            System.out.println("sadece pozitif tam sayılara tanımlıdır");
        } else {
            this.kapi = kapi;
        }
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if (model < 2000) {
            System.out.println("2000 altı model olamaz");
        } else {
            this.model = model;
        }
    }

}
