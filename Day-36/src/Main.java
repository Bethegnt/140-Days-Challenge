public class Main {
    public static int sum(int a, int b){
        int summation = a+b;
        return summation;
    }

    public int sub(int a, int b){
        int subation = a-b;
        return subation;

    }
    public static void main(String args[])
    {
        Main obj = new Main();
        System.out.println(obj.sum(24,34));
        System.out.println(obj.sub(54,23));
    }
}