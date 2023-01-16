public class Main {
    static int a = 12;
    static int c = 23;
    public static void main(String[] args) {
        int b = 13;
       // Main obj = new Main(); nonstatic variable is used by making obj.
       // System.out.println(obj.a);
        System.out.println(Main.a);
        System.out.println(b);
        System.out.println(Main.c);
    }
}