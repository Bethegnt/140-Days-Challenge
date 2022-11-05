public class largest_array {
    public static int getlargest(int number[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i <number.length ; i++) {
            if (largest < number[i]){
                largest = number[i];
            }

        }return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,42345,34567};
        System.out.println("Largest number in this array: "+getlargest(numbers));
    }
}
