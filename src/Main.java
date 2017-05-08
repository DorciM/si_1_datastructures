/**
 * Created by doramedgyasszay on 2017. 02. 09..
 */
public class Main {

    public static void main(String args[]){

        Fibonacci fib = new Fibonacci();
        fib.calcFib(6);

        Factorial fact = new Factorial();
        //System.out.println(fact.calcFact(5));
        System.out.println(fact.calcFactRecursive(5));
    }
}
