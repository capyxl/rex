//判断素数
import java.util.Scanner;

public class JudgePrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        int i;
        int j = 0;
        for(i = 1 ; i < num ; i++){
            if(num % i == 0){
               j++;//如果原数除以i没有余数，j加一
            }

            }
            if(j == 1){
                System.out.println("是素数");//如果j等于1则说明是素数
            }else{
                System.out.println("不是素数");//如果j不等于1则说明不是素数
            }
            
            sc.close();
        }

    }
