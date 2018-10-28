
public class beybladefabrika {

    public beyblade beybladeuret(String beyblade_turu) {

        if (beyblade_turu.equals("dragon")) {
            beybladedragon dragon = new beybladedragon("takao", 800, 800, "Mavi Ejderha");
            return dragon;
        } else if (beyblade_turu.equals("dranza")) {
            beybladedranza dranza = new beybladedranza("kai", 900, 700, "kırmızı anka kuşu");
            return dranza;
        } else if (beyblade_turu.equals("driger")) {
            beybladedriger driger = new beybladedriger("rei", 700, 700, "beyaz kaplan");
            return driger;
        } else if (beyblade_turu.equals("draciel")) {
            beybladedraciel draciel = new beybladedraciel("max", 600, 1000, "kara kaplan");
            return draciel;
        } else {
            return null;
        }

    }
}
