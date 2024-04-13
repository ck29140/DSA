public class stack {
    int arr[];
    int capacity;
    int top;
    public void Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        arr[++top] = x;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        top = top - 1;
    }

    public void display(){
        for (int i = 0;i <= top;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }


}
