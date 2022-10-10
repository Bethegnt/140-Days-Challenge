import java.util.Scanner;
public class Area_and_Perimeter_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int r = sc.nextInt();

        double Perimeter = 2*3.14*r;
        System.out.println("Perimeter of Circle: "+Perimeter);
        double Area = 3.14*r*r;
        System.out.println("Area of Circle: "+Area);

        return ;





    }
}