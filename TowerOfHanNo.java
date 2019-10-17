class TowerOfHanNo{
    private static long s = 0;
    public static void main(String[] args) {
        int n = 6;
        toremove(n, 'a', 'b', 'c');
        System.out.println(s);
    }
     public static void toremove(int n, char a, char b, char c){
         if(1 == n){
             s++;
         }else{
             toremove(n - 1, a, c, b);
             toremove(n - 1, b, a, c);
         }
     }
}