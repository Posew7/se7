
public class commain {

    public static void main(String[] args) {

        comresulotion rs = new comresulotion(1920, 1080);
        commonitor mn = new commonitor(237, 7, "windows", rs);
        comanakart an = new comanakart();
        comkasa ks = new comkasa("pk17", "siyah", 1200);
        combilgisayar pc = new combilgisayar("a4", "a4", an, ks, mn);

        pc.getKasa().pcac();
        pc.getMonitor().ekrankapat();
    }
}
