/**
 * Created by doramedgyasszay on 2017. 04. 29..
 */
public class Node {
    private Object value;
    private Node next;
    private Node previous;

    public Node (Object object){
        this.value = object;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
