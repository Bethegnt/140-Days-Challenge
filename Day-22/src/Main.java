public class Main {
    int a =20;
    int b =10;
    public int multiply(int a , int b ){
        System.out.println(a*b);
        return a+b;
    }

    public static void main(String[] args) {
        Main a1 = new Main();
        System.out.println(a1.a);
        System.out.println(a1.b);
        System.out.println(a1.multiply(a1.a ,a1.b));

    }
}
