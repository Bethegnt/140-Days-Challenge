
import java.util.Scanner;
public class Inches_Convert_into_meter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the inches which convert into meter");
        int a = sc.nextInt();
        double inches = 0.0254*a;
        System.out.println("inch into meter: "+inches);
        return;


    }
}
