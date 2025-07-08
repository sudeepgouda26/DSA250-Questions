public class StackProgram{
    int[] stack;
    int topOftheStack;

    public StackProgram(int size) {
        stack = new int[size];
        topOftheStack = -1; // Stack is initially empty
    }

    public boolean isEmpty(){
        return topOftheStack == -1;
    }
    public boolean isFull(){
        return topOftheStack ==stack.length -1;
    }

    public void push(int val){
        if(isFull()){
            System.out.println("Stack is full. Cannot push " + val);
        } else {
            stack[++topOftheStack] = val;
            System.out.println("Pushed " + val + " to the stack.");
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty. Cannot pop.");
        } else {
           System.out.println("Popped " + stack[topOftheStack--] + " from the stack.");
           topOftheStack--;
        }
    }
    public void peek(){
        try{
        if(isEmpty()){
            System.out.println("Stack is empty. Cannot peek.");
        } else {
            System.out.println("Top element is: " + stack[topOftheStack]);
        }
    }catch(Exception e){
        System.out.println("Stack is empty.");
    }
}
    public void delete(){
        stack = null;
        System.out.println("Stack deleted.");
    }
    public static void main(String[] args) {
        StackProgram stack = new StackProgram(5);
        stack.isEmpty();
        stack.isFull();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek();
        stack.pop();
        stack.peek();
        stack.push(40);
        stack.push(50);
        stack.push(60); // This should show that the stack is full
        stack.delete();
        stack.peek(); // This should show that the stack is empty
        
    }
}