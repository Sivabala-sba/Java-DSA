package DS_One;

public class Queue_1 {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;

    Queue_1(){
        front = -1;
        rear = -1;
    }

    boolean isFull(){
        if(front == 0 && rear == SIZE-1){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(front == -1)
            return true;
        else
            return false;
    }

    void enQueue(int elements){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            if(front == -1)
                front = 0;
            rear++;
            items[rear] = elements;
            System.out.println("Inserted " + elements);
        }
    }

    int deQueue(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return(-1);
        }
        else{
            element = items[front];
            if(front >= rear){
                front = -1;
                rear = -1;
            }
            else{
                front++;
            }
            System.out.println("Deleted -> " + element);
            return (element);
        }
    }

    void display(){
        int i;
        if(isEmpty()){
            System.out.println("Empty Queue");
        }
        else{
            System.out.println("\nFront index-> " + front);
            System.out.println("Items-> ");
            for(i = front; i<=rear; i++)
                System.out.print(items[i] + " ");
            System.out.println("\nRear index-> " + rear);
        }
    }

    public static void main(String[] args){
        Queue_1 q = new Queue_1();

        q.deQueue();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        q.enQueue(6);

        q.display();

        q.deQueue();

        q.display();
    }
}
