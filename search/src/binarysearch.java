public class binarysearch{
    private static int binary(int[] arr,int x,int low,int high){
        if (high >= low) {
            int mid = low + (high - low) / 2;
            // If found at mid, then return it
            if (arr[mid] == x){
              return mid;
            }
            // Search the left half
            else if (arr[mid] > x){
              return binary(arr, x, low, mid - 1);
            }
            // Search the right half
            return binary(arr, x, mid + 1, high);
          }
          return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2,5,6,9,3,87,32,65};
        int low = 0;
        int high = arr.length - 1;
        int key = 87;
        int result = binary(arr, key,low,high);

        if(result == -1){
            System.out.println("nilai " + key + " tidak di temukan");
        }
        else{
            System.out.println("Nilai " + key + " ditemukan di index " + result );
        }
    }
    
}