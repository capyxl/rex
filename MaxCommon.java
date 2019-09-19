//最大公约数
import java.util.Scanner;

public class MaxCommon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数");
        int i = sc.nextInt();
        int j = sc.nextInt();
        int maxnum = 0;
        int k = 0;
        int a = 0;
        if(i > j){
            maxnum = i;
        }else{
            maxnum = j;
        }
        for(k = 1 ; k <= maxnum ; k++){
            if(i % k == 0 && j % k == 0){
                a = k;
            }
        }
        System.out.println(a);
    }
}