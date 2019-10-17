/**
 * @ClassName ReturnDoubleArray
 * @auther REX
 * @DATE 2019/10/17 20:43
 * @Version 1.0
 **/
public class ReturnDoubleArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int[] ret = func(array);
        for (int x : array){
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i : ret){
            System.out.print(i + " ");
        }
    }

    public static int[] func(int[] array){
        int [] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i] * 2;
        }
        return array1;

    }
}
