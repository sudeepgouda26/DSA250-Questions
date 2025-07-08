import java.util.Stack;

public class FunctionStack {
    private Stack<Runnable> JVMStackSimulation;
    private String currentFunction;
    public FunctionStack(){
        JVMStackSimulation = new Stack<>();
        currentFunction = "main";
    }

    public String currentFunction() {
        return currentFunction;
    }

    public void addFunctionName(Runnable FunnctionName){
       JVMStackSimulation.push(FunnctionName);
      

    }

    public void popFun(){
        if(!JVMStackSimulation.isEmpty()){
          Runnable  function =JVMStackSimulation.pop();
          function.run();
           for (int i = JVMStackSimulation.size() - 1; i >= 0; i--) {
            System.out.println(" -> " + JVMStackSimulation.get(i).toString());
        }
        } else {
            System.out.println("No functions to pop.");
        }
    }
    public static void  firstFunction(){
        System.out.println("first one");
    }
    public static void SecondFun(){
        System.out.println("second one");
    }
    public static void main(String[] args){

     FunctionStack stack = new FunctionStack();
     
     stack.addFunctionName(FunctionStack::firstFunction);
        stack.addFunctionName(FunctionStack::SecondFun);
     stack.popFun();
     stack.popFun();

    }
}


