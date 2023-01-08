import java.sql.Statement;

public class static_variable {
    int a;
    static int b; // this is static variable which is used for only static

    public static void main(String[] args) {
        static_variable obj =new static_variable();
       // System.out.println("the value of instance variable: "+obj.a);
        int s = 12;
        int c = 12;
        int f = obj.a*static_variable.b+s+c;
        System.out.println("print the final value: "+f);
    }
}
