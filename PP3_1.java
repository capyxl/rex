//随机产生名称，用姓的第一个字，加上名的前五位，加上一个10 - 输入整数-1，构成随机命名
import java.util.Scanner;
import java.util.Random;

class PP3_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        String a,b,c;
        int i,j;

        System.out.println("请输入姓");
        a = sc.nextLine();
        System.out.println("请输入名");
        b = sc.nextLine();
        //结合姓，名组合后的字符串
        c = a.substring(0,1) + b.substring(0,5);
        

        System.out.println("请输入一个整数");
        i = sc.nextInt();
        //产生随机数
        j = ra.nextInt(i) + 10;
        //整合随机姓名
        System.out.println("随机姓名   " + c + j);
      
    }
}