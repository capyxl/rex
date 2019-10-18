import java.util.Arrays;

/**
 * @ClassName TwoDimensionalArray
 * @auther REX
 * @DATE 2019/10/18 23:32
 * @Version 1.0
 **/
//打印二维数组
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6,},{7,8,9,}};
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("]");
        }
        // System.out.println(Arrays.deepToString(arr));
    }
}
