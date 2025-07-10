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

    public void enQueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }else if(isEmpty()){
            boq = 0;
            toq = 0;
            queue[ ++toq] = data;
            System.out.println("Enqueued: " + data);
        }else{
            
            queue[++toq] = data;
             System.out.println("Enqueued: " + data);
        }
    }

    public static void main(String[] args) {
        QueueWithArray queue = new QueueWithArray(5);

        System.out.println("Is queue empty? " + queue.isEmpty());
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
    }
}