public class StringPalindrome {

   public static void main(String[] args) {
     String str ="helleh";
    int n = str.length()-1;
    System.out.println(reverse(str,0,n));


   } 
   public static boolean reverse(String str ,int start, int n){
      if(n<0){
        return true;
      }
    if(str.charAt(start) !=str.charAt(n) 
    ){
        return false;
    }else{
     reverse(str, start+1, n-1);
    }

return true;

      
}
}

