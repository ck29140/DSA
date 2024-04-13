public class queue {
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
        return (front == 0 && rear == capacity - 1);
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
        rear++;
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
            front++;
        }
        System.out.println("Element deleted :- "+arr[front-1]);
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue Empty");
        }
        for(int i = front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
