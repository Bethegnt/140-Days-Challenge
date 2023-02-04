// this is compile time {Method Overloading}.
class Main{
    void fun1(){
        System.out.println("i am learning");
    }
    void fun1(int a){
        System.out.println("i am run");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun1();
        obj.fun1(5);
    }
}

// esme sabse pahle hmko agar fun1() and fun1() do baar aa jaye to overiding ho jati hai.
// aur agar argumnets different kar denge to method overloading ho jaega.
