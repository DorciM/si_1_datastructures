public class Stack {

    Node top;

    public void push(Object object){
        Node node = new Node(object);
        if (top == null){
            top = node;
        } else {
            node.setPrevious(top);
            top.setNext(node);
            top = node;
        }
    }

    public Object pop(){
        if (top == null){
            return null;
        } else {
           Object result = top.getValue();
           top = top.getPrevious();
           if (top != null){
               top.setNext(null);
           }
           return result;
        }
    }

    public boolean contains(Object object){
        Node node = new Node(object);
            while (top.getValue() != null){
                if (top.getValue() == node.getValue()){
                    return true;
                } else {
                    node.setPrevious(top);
                    top.setNext(node);
                    top = node;
                }
            }
        return false;
        }


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("himi");
        stack.push("humi");
        stack.push("hami");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Contains? " + stack.contains("hmi"));

    }
}