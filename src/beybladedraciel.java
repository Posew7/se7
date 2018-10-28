
public class beybladedraciel extends beyblade {

    private String kutsal_canavar;

    public beybladedraciel(String beybladeci, int saldiri_gucu, int donus_hizi, String kutsal_canavar) {
        super(beybladeci, saldiri_gucu, donus_hizi);
        this.kutsal_canavar = kutsal_canavar;
    }

    @Override
    public void kutsalcanavariortayacikar() {
        System.out.println(super.getBeybladeci() + " " + kutsal_canavar + "ı ortaya çıkarıyor");
    }

    @Override
    public void listele() {
        super.listele(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("kutsal canavar : " + kutsal_canavar);
    }

}
