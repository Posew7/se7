
import java.util.ArrayList;

public class sarkici {

    public void sarkicilar_listele(ArrayList<String> array) {
        for (String x : array) {
            System.out.println(x);
        }
    }

    public void sarkici_ekle(ArrayList<String> array, String sarkici) {
        array.add(sarkici);
        System.out.println("şarkıcı listesi güncellendi");
    }

    public void sarkici_guncelle(ArrayList<String> array, String sarkici, int pozisyon) {
        array.set(pozisyon, sarkici);
        System.out.println("şarkıcı listesi güncellendi");
    }

    public void sarkici_sil(ArrayList<String> array, int pozisyon) {
        array.remove(pozisyon);
        System.out.println("şarkıcı listesi güncellendi");
    }

    public void sarkici_ara(String sarkici_ismi, ArrayList<String> array) {
        int pozisyon = array.indexOf(sarkici_ismi);

        if (pozisyon >= 0) {
            System.out.println("şarkıcı bulundu\n"
                    + "şarkıcı : " + array.get(pozisyon));
        } else {
            System.out.println("listede böyle bir şarkıcı yoktur");
        }
    }
}
