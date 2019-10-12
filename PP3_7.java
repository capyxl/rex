//海伦公式求三角形面积,结果保留三位小数

import java.util.*;
import java.text.DecimalFormat;

class PP3_7{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat de = new DecimalFormat("0.###");

        double a,b,c,s,area;

        System.out.println("请分别输入三边长度");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));


        System.out.println( "三角形面积为:   " + de.format(area));


    }
}