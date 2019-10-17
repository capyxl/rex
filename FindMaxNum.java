/**
 * @ClassName FindMaxNum
 * @auther REX
 * @DATE 2019/10/17 21:30
 * @Version 1.0
 **/
//寻找数组中最大数
public class FindMaxNum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 1, 5, 6, 9, 145, 45};

        int max = func(arr);
        System.out.println("数组中最大的数是:  " + max);
    }

    public static int func(int[] array){
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            if(ret < array[i]){
                ret = array[i];
            }
        }
        return ret;

    }
}
