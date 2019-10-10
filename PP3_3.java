//随机产生电话号，并且前三位数不能有8，9，中间三位不能大于655最后是四位数，并且中间用 -  相连
import java.util.Random;

class PP3_3{
    public static void main(String[] args) {
        
        Random ran = new Random();
        int a,b,c,d,e;

        //产生随机数
        a = ran.nextInt(8);
        b = ran.nextInt(8);
        c = ran.nextInt(8);
        d = ran.nextInt(655);
        e = ran.nextInt(10000);

        //拼接随机数
        System.out.print("随机号码是:   "  + a);
        System.out.print(b);
        System.out.println(c + "-" + d + "-" + e);
    }
}