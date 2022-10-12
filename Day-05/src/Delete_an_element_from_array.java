public class Delete_an_element_from_array {
    public static int delete(int a[], int key) {
        int i = 0;
        int n = a.length;
        for (; i < n; i++) {
            if (a[i] == key) {
                break;

            }

        }
        if (i == n) return n;
            for (int j = 0; j < n-1; j++) {
                a[j] = a[j+1];

            }
            return n-1;
        }
        public static void main(String[]args){
            int a[] = {2, 1, 4, 6, 5};
            int key = 1;
            delete(a, key);
            for(int e: a)
                System.out.println(e+" ");
        }
    }