import java.util.Scanner;
public class Funtion {
    public static void main(String args[]){
        System.out.println("this is stating point of function class");
        f1();
        f2(23,34);
        System.out.println("this is end point of function class");
    }
    public static void f1(){
        System.out.println("this is starting of f1");
        System.out.println("this is end of the f1");
    }
    public static int f2(int a,int b){
        System.out.println("Print the number 1: "+a);
        System.out.println("Print the number 2: "+b);
        return a+b;
    }
}
