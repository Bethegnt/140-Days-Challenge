//public class multilevel_inheritance {
    //private static void fun1(){
      //  System.out.println("i am eating");
    //}
    // multilevel_inheritance(int a){
       // System.out.println("i am running");
    //}
public class multilevel_inheritance{
        static void fun3(){
            System.out.println("i am eat");
        }
        static void fun4(){
            System.out.println("i am run");
        }

    public void main(String[] args) {
        multilevel_inheritance obj = new multilevel_inheritance();
        //obj.fun1();
        obj.fun3();
        //obj.fun2();
        //obj.multilevel_inheritance(5);
        obj.fun4();

    }


}

// there is errors:
// 1. first error is constructor is not inherit property.
// 2. second error is private access modifier is not inherit property.
