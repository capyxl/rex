/**
 * @ClassName YxlArrayListTest
 * @auther REX
 * @DATE 2019/10/26 10:41
 * @Version 1.0
 **/
//顺序表测试
public class YxlArrayListTest {
    public static void main(String[] args) {
        YxlArrayLink arr = new YxlArrayLink();
        arr.insert(0,1);
        arr.insert(1,2);
        arr.insert(2,3);
        arr.insert(3,4);
        arr.insert(4,4);
        arr.insert(5,6);
        arr.insert(6,7);
        arr.insert(7,8);
        arr.insert(8,9);
        arr.insert(9,10);
        arr.insert(10,11);
        arr.insert(11,12);
        arr.insert(12,13);
        arr.insert(13,14);

        arr.display();
        System.out.println("===========================================================================");
        arr.changeSet(13,999);
        arr.display();
        arr.changeAll(4,111);
        arr.display();
    }
}
