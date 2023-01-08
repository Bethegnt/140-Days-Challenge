public class variable_instance {
    int a ;   // Instance Variable non static
    String s;  // Instance Variable
    public static void main(String[] args)
    {
        int b = 10; // local Variable
        variable_instance obj = new variable_instance();
        System.out.println("value of a :"+obj.a);
        System.out.println("value of s :"+obj.s);
        System.out.println("value of b :"+b);
    }
}
