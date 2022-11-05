import java.util.*;
public class largest_num {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,15,6,27,8};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (max<arr[i]){
                max = arr[i];
            }

        }
        System.out.println("Largest number: "+ max);
     }

}











