//99 乘法表
public class MuTable{
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        for(i = 1 ; i < 10 ; i++){
            for(j = 1 ; j < 10 ; j++){
                System.out.print(i + " * " + j + " = " + i*j + "  ");
            }System.out.println(" ");
        }
    }
}