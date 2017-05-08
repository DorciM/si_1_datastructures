import java.util.HashSet;
import java.util.Set;

/**
 * Created by doramedgyasszay on 2017. 02. 21..
 */

//Using HashSet
public class FindDuplicateNumber {

    public static int find(int[] numbers){
        Set<Integer> integerSet = new HashSet<>();
        for (int i=0; i< numbers.length; i++){
            if (integerSet.contains(numbers[i])) {
                return numbers[i];
            } else {
                integerSet.add(numbers[i]);
            }
        }
    return 0;
    }
}
