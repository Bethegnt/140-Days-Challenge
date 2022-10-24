public class Main {
    static double area (double r){
       return Math.PI*r*r;
    }
    static double area(double length,double breadth)
    {
        return length*breadth;
    }
    public static void main(String[] args) {
        System.out.println(area(3,3));
    }
}