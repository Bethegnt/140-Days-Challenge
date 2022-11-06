public class floor {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = floor_(arr,target);
        System.out.println(ans);

    }
//
    public static int floor_(int arr[],int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end - start);
            if(target < arr[mid]){
                end = arr[mid]-1;

            } else if (target> arr[mid]) {
                start = arr[mid]+1;

            }else{
                return mid;
            }
        }
        return start;
    }
}
