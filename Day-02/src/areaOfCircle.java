import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Print the radius of circle: ");
        float rad = sc.nextFloat();

        float area =  3.14f*rad*rad;
        System.out.println(area);
    }
}
