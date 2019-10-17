//计算 1/1 - 1/2 - ... - 1/100
public class Compute{
    public static void main(String[] args){
        double i = 0;
        double num = 1;
        double j = 0;
        for(i = 2 ; i <= 100 ; i++){
            num = num - 1/i;
        }
        System.out.println(num);
    }
}