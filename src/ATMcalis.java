
public class ATMcalis {
    
    public static void main(String[] args) {
        
        ATMhesap hesap = new ATMhesap("posew7", "1907", 1000);
        ATMatm atm = new ATMatm();
        atm.calis(hesap);
        System.out.println("çıkış yaptınız\n"
                + "yine bekleriz");
    }
}
