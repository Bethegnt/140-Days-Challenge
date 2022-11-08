public class subarray_sum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        sum_of_subarray(arr);

    }

    public static void sum_of_subarray(int arr[]) {
        int currsum  =0 ;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum+=arr[k];

                }
                System.out.println("total sum: "+currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;

                }
            }

        }
        System.out.println("max sum: "+maxsum);

    }
}
