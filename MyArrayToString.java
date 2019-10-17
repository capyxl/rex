/**
 * @ClassName MyArrayToString
 * @auther REX
 * @DATE 2019/10/17 21:14
 * @Version 1.0
 **/
//数组转字符串输出
public class MyArrayToString {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        String ret = func(array);
        System.out.println(ret);
    }

    public static String func(int[] array) {
        String ret = "数组是： [ ";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if (i != array.length - 1) {
                ret += ",";
            }
        }
        ret += " ]";
        return ret;

    }
}