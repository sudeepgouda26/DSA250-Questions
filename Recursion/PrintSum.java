public class PrintSum {
   public static void main(String[] args) {
  System.out.println(printSum(10));
   }

   private static int printSum(int i) {
    if(i ==0){
        return 0;
    }
   return printSum(i-1) + i;
   } 
}
