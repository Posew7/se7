
import java.util.Arrays;
import java.util.Random;

public class array1 {

    public static int[] arraydoldur(int sayi) {
        Random rand = new Random();
        int a[] = new int[sayi];
        for (int i = 0; i < sayi; i++) {
            a[i] = rand.nextInt(21) + 1;
        }
        return a;
    }

    public static void arrayyazdir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". eleman : " + array[i]);
        }
    }

    public static void arraysirala(int[] array) {
        Arrays.sort(array);
        arrayyazdir(array);
    }

    public static void main(String[] args) {

        int[] array = arraydoldur(7);
        arrayyazdir(array);
        System.out.println("");
        System.out.println("*************");
        System.out.println("");
        arraysirala(array);

    }
}
