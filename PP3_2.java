//输入两个整数 返回两个整数的立方和
import java.util.Scanner;

class PP3_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a,b,c;

        System.out.println("请输入两个整数");
        a = sc.nextInt();
        b = sc.nextInt();

        c = a* a* a + b* b* b;
        System.out.println(c);

    }
}