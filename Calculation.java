import java.util.Scanner;

/**
 * @ClassName Calculate
 * @auther REX
 * @DATE 2019/10/21 15:44
 * @Version 1.0
 **/
//输入两个数计算加减乘除
public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        Calculate ca = new Calculate(num1, num2);
        ca.sum();
        ca.cut();
        ca.mul();
        ca.exc();
    }
}

class Calculate{
    double num1;
    double num2;
    Calculate(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void sum() {
        System.out.println("第一个数加第二个数等于： " + (num1 + num2));
    }
    public void cut(){
        System.out.println("第一个数减第二个数等于： " + (num1 - num2));
    }
    public void mul(){
        System.out.println("第一个数乘第二个数等于： " + (num1 * num2));
    }
    public void exc(){
        System.out.println("第一个数除第二个数等于： " + (num1 / num2));
    }

}
