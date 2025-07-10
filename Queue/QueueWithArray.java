public class QueueWithArray{
    int[] queue;
    int toq,boq;

    public QueueWithArray(int size){
        queue = new int[size];
        toq = -1;
        boq = -1;
    }
    public boolean isEmpty(){

        return toq==-1 || boq == queue.length;
    }
    public boolean isFull(){
        return toq==queue.length-1 ;
    }

    public void enQueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }else if(toq==-1){
            boq = 0;
            queue[++toq] = data;
            System.out.println("Enqueued: " + data);
        }else{
            
            queue[++toq] = data;
             System.out.println("Enqueued: " + data);
        }
    }

    public void deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }else{
            System.out.println("Dequeued: " + queue[boq]);
            boq++;
            if(boq > toq) {
                boq = -1; // Reset if queue is empty
                toq = -1;
            }
        }
        
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.println("peek element: " + queue[boq]);
        }
    }
    public void delete(){
        queue = null;
        toq = -1;
        boq = -1;
        System.out.println("Queue deleted");
    }

    public static void main(String[] args) {
        QueueWithArray queue = new QueueWithArray(5);

        System.out.println("Is queue empty? " + queue.isEmpty());
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
           queue.enQueue(50);
              queue.enQueue(40);

        System.out.println("Is queue full? " + queue.isFull());
        queue.deQueue();
        queue.deQueue();
        queue.peek();
         queue.deQueue();
        queue.deQueue();
         queue.deQueue();
        queue.deQueue();
         queue.deQueue();
        queue.deQueue();
        
        
         
        
         
    }
}