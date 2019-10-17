/**
 * @ClassName Average
 * @auther REX
 * @DATE 2019/10/17 21:41
 * @Version 1.0
 **/
//求数组平均数
public class Average {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 1, 5, 6, 9, 145, 45};

        double max = func(arr);
        System.out.println("数组的平均数是:  " + max);
    }

    public static double func(int[] array){
        double ret = 0.0;
        for (int i = 0; i < array.length; i++) {
            if(ret < array[i]){
                ret += array[i];
            }
        }
        return ret/array.length;

    }
}
