public class poly_case01 {
    void fun1(int a){
        System.out.println("i am read");
    }
    void fun1(String a){
        System.out.println("i am eat");
    }

    public static void main(String[] args) {
        poly_case01 obj = new poly_case01();
        obj.fun1(1);
    }
}
