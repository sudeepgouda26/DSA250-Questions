public class Print10to1 {
    public static void main(String[] args) {
        printnumber(10);
    }

    private static void printnumber(int i) {
       if(i==0){
        return;
       }
       System.out.println(i);
       printnumber(i-1);
    }

    
}