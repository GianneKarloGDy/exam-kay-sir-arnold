public class BubbleSort {
 
    public static void main(String[] args) {
  
        int arr[] = {28, 69, 8, 36, 96};
  
        for(int i = 0; i < arr.length-1; i++) {
           for(int j = 0; j < arr.length-1-i; j++) {
                 
                 // swap the elements
                 if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                 }
            }
        }
  
       for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
       }
   }
  
 }