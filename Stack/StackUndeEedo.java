import java.util.Stack;

public class StackUndeEedo{
    private Stack<String> forwardStack,BackWardSTack;
    private String currentWord;


    public StackUndeEedo(){
        forwardStack =new Stack<>();
        BackWardSTack =new Stack<>();
        currentWord ="";


    }

    public String currentWord(){
        return currentWord;
    }
    public void AddWord(String word){
        BackWardSTack.push(currentWord);
        currentWord=    word ;

    }


    public void Undo(){
        if(!BackWardSTack.isEmpty()){
            forwardStack.push(currentWord);
            currentWord=BackWardSTack.pop();
        }
    }
    public String Redo(){
        if(!forwardStack.isEmpty()){
          BackWardSTack.push(currentWord);
          currentWord=forwardStack.pop();
        }
        return currentWord;
    }
    public static void main(String[] args) {
        StackUndeEedo stack =new StackUndeEedo();
         stack.AddWord("hello ");
         stack.AddWord("Bye ");
        stack.Undo();
        stack.Redo();
          
         
       String current = stack.Redo() +stack.currentWord(); 




         
    }



}

