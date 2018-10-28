
import java.util.ArrayList;

public class array2 {

    public static void main(String[] args) {

        int[] a = {1, 5, 8, 7, 9, 63, 4, 7};

        ArrayList<Integer> s = new ArrayList<Integer>();
        s.add(1);
        s.add(4);
        s.add(6);

        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("");
        for (Integer y : s) {
            System.out.println(y);
        }

        ArrayList<String> rock = new ArrayList<String>();

        rock.add("metalica");
        rock.add("iron maiden");
        rock.add("ac dc");
        rock.add("megadeth");

        rock.remove(3);

        System.out.println("rock arraylistin uzunluğu : " + rock.size());

        for (String w : rock) {
            System.out.println(w);
        }
    }
}
