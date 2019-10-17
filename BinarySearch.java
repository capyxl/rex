import java.util.Scanner;

/**
 * @ClassName BinarySearch
 * @auther REX
 * @DATE 2019/10/17 22:14
 * @Version 1.0
 **/
//二分查找
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int i = func(arr);
        if(i == -1){
            System.out.println("没找到");
        }else if(i >= 0){
            System.out.println("数在第 " + i + " 位");
        }

    }

    public static int func(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要找的数");
        int num = sc.nextInt();
        int left = 0;
        int right = arr.length - 1;
        int mid = -1;
        while(left <= right){
            mid = (left + right) / 2;
            if(num == arr[mid]){
                return mid;
            }else if(num < arr[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        mid = -1;
        return mid;
    }
}
