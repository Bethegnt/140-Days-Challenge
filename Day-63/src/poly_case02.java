public class poly_case02 {
    void show(Object a){
        System.out.println("object method");
    }
    void show(String a){
        System.out.println("string method");
    }

    public static void main(String[] args) {
        poly_case02 obj = new poly_case02();
        obj.show("abc");
    }
}
