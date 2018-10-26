
public class fonk3 {
    
    public static int ikiilecarp(int a) {
        return a * 2;
    }
    
    public static int dortilecarp(int a) {
        return a * 4;
    }
    
    public static int yediiletopla(int a) {
        return a + 7;
    }

    public static void main(String[] args) {
        System.out.println("sonuç değer : " + dortilecarp(ikiilecarp(yediiletopla(7))));
    }
}
