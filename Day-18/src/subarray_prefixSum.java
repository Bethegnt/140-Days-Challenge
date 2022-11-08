public class subarray_prefixSum {
    public static void main(String[] args) {
        int[] arr = {-1,-2, 6, -1, 3};
        maxsubarray_prefix(arr);

    }

    public static void maxsubarray_prefix(int arr[]) {
        int currsum  =0 ;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        // for calculate the sum of array through prefix
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];

        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currsum = start ==0 ? prefix[end]: prefix[end] -prefix[start-1];
//                for (int k = i; k <= j; k++) {
//                    currsum+=arr[k];
//
//                }
                if (maxsum < currsum) {
                    maxsum = currsum;

                }
            }

        }
        System.out.println("max sum: "+maxsum);

    }
}
