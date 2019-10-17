import java.util.Scanner;

/**
 * @ClassName FindSum
 * @auther REX
 * @DATE 2019/10/17 21:43
 * @Version 1.0
 **/
//查找数组中的数在数组第几位
public class FindSum {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("请输入一个数");
            arr[i] = sc.nextInt();
        }
        System.out.println("输入结束 =====================================================================");
        func(arr);

    }

    public static void func(int[] arr){
        System.out.println("请输入您要找的数");
        Scanner sc1 = new Scanner(System.in);
        int sum = sc1.nextInt();
        int ret = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == sum){
                ret = i;
                System.out.println("您要查的数再数组的第 " + i +" 位");
            }

        }
        if(ret == -1){
            System.out.println("您要查的数不在数组中");

        }

    }
}
