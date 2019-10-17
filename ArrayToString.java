import java.util.Arrays;
/**
 * @ClassName arrayToString
 * @auther REX
 * @DATE 2019/10/17 21:00
 * @Version 1.0
 **/
//字符串形式打印数组
public class ArrayToString {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String output = Arrays.toString(arr);
        System.out.println(output);
    }


}