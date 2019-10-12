//随机产生半径和高范围为(1 - 20)  并计算援助体积和表面积

import java.util.*;

class PP3_9{
    public static void main(String[] args) {
        
        Random rd = new Random();

        int r,h;
        double v,area;

        r = rd.nextInt(20) + 1;
        h = rd.nextInt(20) + 1;
        area = 3.14 * Math.pow(r , 2) * h;
        v = 3.14 * 2 * r * h;

        System.out.println("r = " + r);
        System.out.println("h = " + h);
        System.out.println("area = " + area);
        System.out.println("v = " + v);

    }
}
