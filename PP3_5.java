//编写程序计算两个点之间的距离

import java.util.Scanner;

class PP3_5{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double a,b,c,d,e;

    System.out.println("请输入两组坐标");

    System.out.println("请输入第一组坐标");
    System.out.println("x1");
    a = sc.nextDouble();
    System.out.println("y1");
    b = sc.nextDouble();
    System.out.println("请输入第二组坐标");
    System.out.println("x2");
    c = sc.nextDouble();
    System.out.println("y2");
    d = sc.nextDouble();
    //两点间坐标计算公式
    e = Math.sqrt(Math.pow((c - a), 2) + Math.pow((d - b), 2) ) ;

    System.out.println("两点间的距离为" + e);
    }
}