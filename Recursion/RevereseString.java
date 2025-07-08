public class RevereseString {
   public static void main(String[] args) {
     String str ="hello";
    int n = str.length()-1;
    System.out.println(reverse(str,n));


   } 
   public static String reverse(String str , int n){
      if(n<0){
        return"";
      }
      return str.charAt(n) + reverse(str, n-1);
}
}
