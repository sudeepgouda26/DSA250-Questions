public class Print1ToN {
public static void main(String[]args){
	
    printnumber(10);
}

private static void printnumber(int i) {
    // TODO Auto-generated method stub
    if(i==0){
        return;

    }

    printnumber(i-1);
    System.out.println(i);
    
}
}