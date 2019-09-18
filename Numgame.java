//导入util包
import java.util.Scanner;
import java.util.Random;

public class Numgame {
    public static void main(String[] args){
        Random random = new Random();  //默认随机种子为系统时间
        Scanner s = new Scanner(System.in);
        int digit = random.nextInt(100);
       // System.out.println("digit :" + digit );
        while(true){
            System.out.println("请输入一个数字（1 - 100）" );
            int num = s.nextInt();
            if(num < digit){
                System.out.println("猜小了");
           
             } else if(num > digit){
                    System.out.println("猜大了");

                } else {
                    System.out.println("you are right");
                    break;
                }
                
            }
            s.close();
        }
    }
