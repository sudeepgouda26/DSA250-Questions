public class ReveresArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr,  arr.length - 1);
       
    }

    private static void reverse(int[] arr, int n) {
        if(n==-1){
            return;
        }

        System.out.print(arr[n] + "  ");
        reverse(arr, n-1);
    }
    
}
