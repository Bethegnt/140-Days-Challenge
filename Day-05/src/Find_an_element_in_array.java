public class Find_an_element_in_array  {
    public static void main(String[] args) {
        int a[] = {2,1,4,6,4};
        int key = 6;
        int res = -1;
        // search for key
        for (int i = 0; i < a.length; i++) {
            if (a[i]==key){
                res = i;
                break;
            }

        }
        if (res == -1){
            System.out.println(" key is not found");

        }
        else {
            System.out.println("key is present" + res);
        }
    }

}