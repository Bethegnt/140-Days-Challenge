public class Animals {
    int sum;
    // Write the first constructor.
    Animals(){
        this(23,34);
    }
   Animals(int args01,int args02){
        // this is add function in for addition.
        this.sum = args01+args02;
   }void dispalay(){
        System.out.println("sum is :"+sum);
    }
    public static void main(String[] args) {
        // Calling the first constructor:
        Animals duzo = new Animals();
        duzo.dispalay();

        System.out.println();
    }
}
// if you want one constructor call in the another constructor then used this() keyword.