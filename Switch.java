//数字排序输出冒泡法
class Switch{
    public static void main(String[] args){
        int a[] = {19,8,21,6,5,90,3,2,1,0};
        //数字由小到大排序
       for(int j = 0; j < 10; j++){
        for(int i = 0; i < 9; i++){
            if(a[i] > a[i + 1]){
                a[i] = a[i] ^ a[i + 1];
                a[i + 1] = a[i] ^ a[i + 1];
                a[i] = a[i] ^ a[i + 1];
            }
            
        }
    }
   
   for(int i = 0; i < 10; i++){
       System.out.println(a[i]);
   }

}
}