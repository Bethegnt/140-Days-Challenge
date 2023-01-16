import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int num = sc.nextInt();

        if(num%4==0){
            System.out.println("this is a leap year");
        }else{
            System.out.println("this is not leap year");
        }
        //System.out.println("Hello world!");
    }
}