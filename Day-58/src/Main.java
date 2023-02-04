public class Main {
     static void mainA(){
        System.out.println(" I am running");
    }
     static void mainB(){
        System.out.println("i am run");
    }
static class B extends Main{
         static void mainC(){
            System.out.println("I am fast ");
        }
         static void mainD(){
            System.out.println(" I am writer");
        }

}
    public static void main(String[] args) {
        B obj = new B();
        obj.mainD();
        obj.mainA();
        obj.mainB();
        obj.mainC();
    }
}
 // this is single level inheritance.

