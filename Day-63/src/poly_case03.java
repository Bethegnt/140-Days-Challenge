public class poly_case03 {
    void show(StringBuffer a){
        System.out.println("i am read");
    }
    void show(String a){
        System.out.println("i am run");
    }
    public static void main(String[] args) {
        poly_case03 obj = new poly_case03();
        obj.show(new String("abc"));
        obj.show(new StringBuffer("xyz"));
        //obj.show((null));
        // case 03 of polymorphism.
    }
}
