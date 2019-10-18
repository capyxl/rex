import java.util.Arrays;

/**
 * @ClassName OddNumber
 * @auther REX
 * @DATE 2019/10/18 22:31
 * @Version 1.0
 **/
//打印数组，偶数在前，奇数在后
public class OddNumber {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(arr));
        int[] ret = func(arr);
        System.out.println(Arrays.toString(ret));
    }

    public static int[] func(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] % 2 != 0){
                if(arr[j] % 2 == 0){
                    arr[i] = arr[j] ^ arr[i];
                    arr[j] = arr[j] ^ arr[i];
                    arr[i] = arr[j] ^ arr[i];
                    i++;
                    j--;
                }else{
                    j--;
                }
                if(arr[i] % 2 == 0){
                    i++;
                }
            }

        }
        return arr;
    }
}
