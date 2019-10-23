/**
 * @ClassName TestLinkedList
 * @auther REX
 * @DATE 2019/10/23 9:18
 * @Version 1.0
 **/
public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList link = new MyLinkedList();
        link.addFirst(1);
        link.addFirst(3);
        link.addFirst(5);
        link.addFirst(4);
        link.addFirst(3);
        link.addFirst(2);
        link.addFirst(1);
        link.addIndex(7, 7);
        link.display();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        link.partition(4);
        //link.reverse();
        //link.middle();
        link.display();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


    }
}
