import java.util.Arrays;

/**
 * @ClassName NewArray
 * @auther REX
 * @DATE 2019/10/17 21:24
 * @Version 1.0
 **/
//复制数组，不改变原数组
public class NewArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] newarr = Arrays.copyOf(array, array.length);
        System.out.println("newarr = " + Arrays.toString(newarr));


        newarr[0] = 9;
        System.out.println("array " + Arrays.toString(array));
        System.out.println("newarr " + Arrays.toString(newarr));

    }
}
