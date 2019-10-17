//0-999水仙花数
import java.util.Scanner;

public class Daffodil{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个0-999的整数");
        int num = sc.nextInt();
        int a = 0;
        for(a = 1; a <=num; a++){
          int i = a / 100;//i = 百位数字
          int j = a % 100 / 10;//j = 十位数字
          int k = a % 100 % 10;//k = 个位数字
            if(a == i*i*i + j*j*j + k*k*k){
                System.out.println(a);
            }
        }

    }
}