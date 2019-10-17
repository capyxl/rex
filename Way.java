//计算1! + 2! + …… +n!的值
public class Way{
    public static void main(String[] args) {
        int sum = 0;
        //计算每一个阶乘的和
        for(int i = 1; i <= 5; i++){
            int tmp = 1;
            //计算每个数的阶乘
            for(int j = 1; j <= i; j++){
                tmp *= j;

            }
            sum += tmp;
        }
       System.out.println("累加和 = " + sum); 
    }
}