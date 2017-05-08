/**
 * Created by doramedgyasszay on 2017. 02. 20..
 */
public class Factorial {

    int fact = 1;

    public int calcFact(int num){
       for (int i=1; i<= num; i++){
           fact = fact * i;
       }
       return fact;
    }

    public int calcFactRecursive(int num){
        if (num == 0){
            return 1;
        } else  {
            return (num * calcFactRecursive(num-1));
        }
    }
}
