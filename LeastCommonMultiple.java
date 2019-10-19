import java.util.Scanner;

/**
 * @ClassName LeastCommonMultiple
 * @auther REX
 * @DATE 2019/10/19 11:07
 * @Version 1.0
 **/
//判断最小公倍数，辗转相除法
public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入2个整数");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int max = first < second ? second : first;
        int min = first < second ? first : second;
        int num = 0;
        while(min != 0){
            int i = 0;
            i = max % min;
            max = min;
            min = i;
        }
        System.out.println("最小公倍数是" + max);

    }
}
