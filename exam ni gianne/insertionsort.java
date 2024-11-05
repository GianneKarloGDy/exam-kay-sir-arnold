public class insertionsort {
    public static void main(String[] args) {
        int[] arr= { 28, 69, 8, 36, 96};

        Sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
       }
    }
    public static void Sort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j=i-1;
            
             // swap the elements
            while (j >= 0 && curr<arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
       }
    }
}
