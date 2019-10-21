/**
 * @ClassName TestDemo
 * @auther REX
 * @DATE 2019/10/21 14:53
 * @Version 1.0
 **/
public class TestDemo {
    public static void main(String[] args) {
        TestDemo1 t1 = new TestDemo1();
        t1.a++;
        TestDemo1.count++;
        System.out.println(t1.a);
        System.out.println(TestDemo1.count);
        System.out.println("====================================================================================");
        TestDemo1 t2 = new TestDemo1();
        t2.a++;
        TestDemo1.count++;
        System.out.println(t2.a);
        System.out.println(TestDemo1.count);
        System.out.println("=======================================================================================");
        t2.a++;
        TestDemo1.count++;
        System.out.println(t2.a);
        System.out.println(TestDemo1.count);


    }
}
class TestDemo1{
    public int a;
    public static int count;
}

