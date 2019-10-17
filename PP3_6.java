//计算圆的体积和表面积，输出保留四位小数
import java.text.DecimalFormat;
import java.util.Scanner;

class PP3_6{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat de = new DecimalFormat("0.####");

        double r,s,v;

        System.out.println("请输入半径");
        r = sc.nextDouble();
        v = 4 / 3 * 3.14 * Math.pow(r,3);
        s = 4 * 3.14 * Math.pow(r, 2);

        System.out.println("面积是  " + de.format(s));
        System.err.println("体积是  " + de.format(v));

        




    }
}