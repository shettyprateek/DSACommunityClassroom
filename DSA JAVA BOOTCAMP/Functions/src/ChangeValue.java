import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 0; // If you make a change to the obj via ref variable, same obj will be changed

    }
}
