public class QueueWithArray{
    int[] queue;
    int toq,boq;

    public QueueWithArray(int size){
        queue = new int[size];
        toq = -1;
        boq = -1;
    }
    public boolean isEmpty(){

        return toq==-1;
    }
    public boolean isFull(){
        return toq==queue.length-1 || boq ==queue.length;
    }

    public static void main(String[] args) {
        QueueWithArray queue = new QueueWithArray(5);
        
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}