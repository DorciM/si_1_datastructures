import java.util.EmptyStackException;

/**
 * Created by doramedgyasszay on 2017. 05. 06..
 */
public class ArrayStack {
    int array[];
    int top;

    ArrayStack(int capacity){
        if (capacity <= 0){
            throw new IllegalArgumentException("Capacity must be a positive integer");
        } array = new int[capacity];
        top = -1;
    }

    public void push(int value){
        if (top == array.length){
            throw new StackOverflowError("Stackoverflow!");
        } top++;
           array[top] = value;
        }


    public void pop(){
        if (top == -1){
            throw new EmptyStackException();
        } top--;
    }

    public int peek(){
        if (top == -1){
            throw new EmptyStackException();
        }
        return array[top];
    }

    public static void main(String[] args) {
        ArrayStack demo = new ArrayStack(4);
        demo.push(12);
        demo.push(1);
        demo.push(42);
        demo.push(6);
        System.out.println(demo.peek());
        demo.pop();
        System.out.println(demo.peek());
    }
}
