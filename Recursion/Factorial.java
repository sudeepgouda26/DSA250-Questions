public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int i) {
       if ((i==0 || i==1 )) {
        return 1;
       }
       
       return factorial(i-1) * i;
    }
    
}
