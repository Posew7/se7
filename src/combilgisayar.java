
public class combilgisayar {

    private String klavye;
    private String mouse;
    private comanakart anakart;
    private comkasa kasa;
    private commonitor monitor;

    public combilgisayar(String klavye, String mouse, comanakart anakart, comkasa kasa, commonitor monitor) {
        this.klavye = klavye;
        this.mouse = mouse;
        this.anakart = anakart;
        this.kasa = kasa;
        this.monitor = monitor;
    }

    public String getKlavye() {
        return klavye;
    }

    public void setKlavye(String klavye) {
        this.klavye = klavye;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public comanakart getAnakart() {
        return anakart;
    }

    public void setAnakart(comanakart anakart) {
        this.anakart = anakart;
    }

    public comkasa getKasa() {
        return kasa;
    }

    public void setKasa(comkasa kasa) {
        this.kasa = kasa;
    }

    public commonitor getMonitor() {
        return monitor;
    }

    public void setMonitor(commonitor monitor) {
        this.monitor = monitor;
    }

}
