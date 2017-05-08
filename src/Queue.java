/**
 * Created by doramedgyasszay on 2017. 02. 21..
 */

public class Queue {

    Node first, last;
    int size = 0;


    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(Object object){
        Node node = new Node(object);
        if (isEmpty()){
            first = last = node;
        } else {
            last.setNext(node);
            last = node;
        }
        size++;
    }

    public Object dequeue(){
       if (isEmpty()){
           return null;
       } else {
           Object result = first.getValue();
           first = first.getNext();
           size--;
           return result;
       }
    }


    public static void main(String args[]){
        Queue queue = new Queue();
        queue.enqueue(345);
        queue.enqueue(44);
        queue.enqueue(654);
        queue.enqueue(9);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


    }
}
