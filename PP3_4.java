//编写一个程序， 输入一个浮点数， 输出不大于他的最大整数， 和不小于他的最小整数
import java.util.Scanner;

class PP3_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 0;
        int b,c;

        a = sc.nextDouble();
        b = (int)a;
        c = b + 1;

        
        System.out.print(a + "  ");
        System.out.print(b + "  ");
        System.out.println(c);

    }
}