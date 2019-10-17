//产生20 - 40 的随机数 并显示这些数的正弦余弦  正切值

import java.util.*;

class PP3_8{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random  ra = new Random();

        int a,b;
        
        a = sc.nextInt();
        b = ra.nextInt(a) + 20;

        System.out.println(Math.asin(b));
        System.out.println(Math.acos(b));
        System.out.println(Math.atan(b));
    }
}