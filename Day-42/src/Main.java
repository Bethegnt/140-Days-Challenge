public class Main {
    int a =123; // non static variable
    static int b = 234; // static variable
    public static void main(String[] args) {
        Main a1 = new Main();
        System.out.println(a1.a);
        System.out.println(b);
        Main f2 = new Main();
        f2.a = 1234;
        b = 23456;
        System.out.println(f2.a);
        System.out.println(Main.b);


        //System.out.println(f1.a+Main.b);
    }
}