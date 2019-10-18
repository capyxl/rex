import java.util.Arrays;


/**
 * @ClassName Bubble2
 * @auther REX
 * @DATE 2019/10/18 14:44
 * @Version 1.0
 **/
//冒泡法优化
public class Bubble2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 1, 5, 6, 7, 4, 2, 7, 2, 10};
        System.out.println(Arrays.toString(arr));
        int[] ret = func(arr);
        System.out.println(Arrays.toString(ret));

    }

    public static int[] func(int[] arr) {
        int k = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                    k++;

                }


            }
            if(k == 0){
                break;
            }


        }
        return arr;
    }
    }


