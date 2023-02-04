public class Main {
    void fun1(int a){
        System.out.println(" i am read");
    }
    void fun1(String num){
        System.out.println(" i am run");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun1(3);
        obj.fun1("numi");

    }
}