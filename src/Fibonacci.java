/**
 * Created by doramedgyasszay on 2017. 02. 20..
 */
public class Fibonacci {

    public int calcFib(int n){
        if (n<= 1){
            return n;
        } else {
            int result =calcFib(n-1)+calcFib(n-2);
            return result;
            }
        }
    }

