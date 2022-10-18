public class Rotating_an_array {
    public static void main(String[] args) {
        int A[] ={1,2,3,4,5,6,7,8,9};
        for(int x:A)
            System.out.println(x+ ",");
        System.out.println("");
        int temp=A[0];
        for (int i = 0; i <A.length ; i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for(int x:A)
            System.out.println(x+ ",");
        System.out.println("");

    }
}
