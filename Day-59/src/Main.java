// this is hierarchical problem example.
public class Main {
    void fun1() {
        System.out.println("i am just adding the number");
    }
    static class Main2 extends Main{
            void fun2 () {
                System.out.println("i am just subtracting number");
            }

        public static void main(String[] args) {
          Main2 obj = new Main2();
          obj.fun1();
          obj.fun2();
        }
        }
     static class Main3 extends Main{
        void fun3(){
            System.out.println("i am just multiply the function");
        }
        void fun4(){
            System.out.println("i am just divide the function");
        }

         public static void main(String[] args) {
             Main3 obj = new Main3();
             obj.fun1();
             obj.fun3();
             obj.fun4();
         }


     }

    }