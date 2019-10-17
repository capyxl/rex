//求第n个斐波拉契数
import java.util.Scanner;

class Fib{
    public static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = fib(n);
        System.out.println(f);
        System.out.println(count); 
    }

    public static int fib(int n){
        //判断是否为第一二个数
        if(1 == n || 2 == n){
            return 1;
        }
        if(3 == n){
            count++;
        }
        //递归求斐波拉契数
        return fib(n -1) + fib(n - 2);
    }
}