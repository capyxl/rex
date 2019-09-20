//年龄判断
import java.util.Scanner;


public class AgeJudgement{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入您的年龄");
    int age = sc.nextInt();
    if(age > 0 && age <= 18){
        System.out.println("少年");
    } else if(age > 18 && age < 29){
        System.out.println("青年");
    }else if(age >28 && age < 56){
        System.out.println("中年");
    }else if(age >55){
        System.out.println("老年");
    }else{
        System.out.println("error");
    }
        sc.close();
    }
}