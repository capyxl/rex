//计算1! + 2! + …… +n!
import java.util.Scanner;

class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        int sum = 0;
        //计算每个数阶乘的和
        for(int i = 1; i <= num; i++){
            //函数调用
            sum += mut(i);
        }
        System.out.println(sum);

    }
    //计算每个数的阶乘
    public static int mut(int n){
        int m = 1;
        for(int j = 1; j <= n; j++){
            
            m *= j;
        }
        return m;
    }
}