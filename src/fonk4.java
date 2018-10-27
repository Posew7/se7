
public class fonk4 {
    
    public static int topla(int a, int b, int c) {
        return a + b + c;
    }

    public static void topla(int a, int b) {
        System.out.println(a + b);
    }

    public static void topla(String a, String b) {
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        System.out.println(topla(7, 13, 11));
        topla(7, 13);
        topla("Türkiye", "Cumhuriyeti");
    }
}
