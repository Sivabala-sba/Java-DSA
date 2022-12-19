package DS_One;

public class Stack_1 {
    static class Stackref{
        private int arr[];
        private int top;
        private int capacity;

        //creating stack
        Stackref(int size){
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        //add elements into stack
        public void push(int x){
            if(isFull()){
                System.out.println("OverFlow\nProgram Terminated");
                System.exit(1);
            }
            System.out.println("Inserting " + x);
            arr[++top] = x;
        }

        //remove elements from stack
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack Empty");
                System.exit(1);
            }
            return arr[top--];
        }

        //Utility function to return the size of the stack
        public int size(){
            return top + 1;
        }

        //check if the stack is empty
        public Boolean isEmpty(){
            return top == -1;
        }

        //check if the stack is full
        public Boolean isFull(){
            return top == capacity - 1;
        }

        public void printStack(){
            for(int i = 0; i<=top; i++){
                System.out.println(arr[i]);
            }
        }

        public static void main(String[] args){
            Stackref stackop = new Stackref(5);

            stackop.push(1);
            stackop.push(2);
            stackop.push(3);
            stackop.push(4);

            stackop.pop();
            System.out.println("\nAfter popping out");

            stackop.printStack();
        }
    }
}
