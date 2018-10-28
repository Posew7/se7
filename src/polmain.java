
class Hayvan {

    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return getIsim() + " konuşuyor..";
    }
}

class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return getIsim() + " havlıyor..";
    }

}

class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return getIsim() + " mivaylıyor..";
    }

}

class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return getIsim() + " kişniyor..";
    }

}

public class polmain {

    public static void konus(Hayvan hayvan) {
        System.out.println(hayvan.getIsim() + " konuşuyor..");
    }

    public static void main(String[] args) {
        Hayvan hayvan1 = new Hayvan("çomar");
        Hayvan hayvan2 = new Kopek("Karabaş");
        Hayvan hayvan3 = new Kedi("tekir");
        Hayvan hayvan4 = new At("akay");

        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());
        System.out.println(hayvan4.konus());

        System.out.println("");
        konus(hayvan1);
        konus(hayvan2);
        konus(hayvan3);
        konus(hayvan4);
        System.out.println("");

    }
}
