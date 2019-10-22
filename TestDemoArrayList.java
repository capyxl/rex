/**
 * @ClassName TestDemoArrayList
 * @auther REX
 * @DATE 2019/10/22 11:04
 * @Version 1.0
 **/
public class TestDemoArrayList {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0, 1);
        myArrayList.add(1, 2);
        myArrayList.add(2, 3);
        myArrayList.add(3, 4);
        myArrayList.add(4, 5);
        myArrayList.add(5, 6);
        myArrayList.add(6, 7);
        myArrayList.add(7, 8);
        myArrayList.add(8, 9);
        myArrayList.add(9, 90);
        myArrayList.add(10, 999);
        myArrayList.add(11,121);
        myArrayList.display();

        myArrayList.deleteKey(90);
        myArrayList.display();
        myArrayList.deleteKey(999);
        myArrayList.display();

    }
}
