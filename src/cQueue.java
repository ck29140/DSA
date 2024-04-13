public class cQueue {
    int capacity;
    int arr[];
    int front,rear;
    public void createQueue(int size){
        arr = new int[size];
        capacity = size;
        front = -1;
        rear = -1;
    }
    public boolean isFull(){
         if(front == 0 && rear == capacity - 1){
             return true;
         }
         if(front==rear+1){
             return true;
         }
         return false;
    }

    public boolean isEmpty(){
        return (front == -1);
    }

    public void enqueue(int x){
        if(isFull()){
            System.out.println("Queue Full");
            System.exit(1);
        }
        if(front==-1){
            front = 0;
        }
        rear = (rear+1)%capacity;
        arr[rear] = x;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty cannot delete");
        }
        if(front >= rear){
            front = -1;
            rear = -1;
        }
        else{
            front = (front+1)%capacity;
        }
        System.out.println("Element deleted :- "+arr[front-1]);
    }

    public void display(){
        int i;
        if(isEmpty()){
            System.out.println("Queue Empty");
        }
        for(i = front;i!=rear;i=(i+1)%capacity){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[i]);

    }

}
