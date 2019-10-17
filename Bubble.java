import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Bubble
 * @auther REX
 * @DATE 2019/10/17 22:35
 * @Version 1.0
 **/
//冒泡排序
public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("请输入十个整数");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("整理前数组是： " + Arrays.toString(arr));

        int[] arr2 = func(arr);
        System.out.println("整理后数组是："  + Arrays.toString(arr2));

    }

    public static int[] func(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }

            }
        }
        return  arr;
    }


}
