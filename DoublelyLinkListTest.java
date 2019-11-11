/**
 * @ClassName DoublelyLinkListTest
 * @auther REX
 * @DATE 2019/10/28 19:47
 * @Version 1.0
 **/
public class DoublelyLinkListTest {
    public static void main(String[] args) {
        DoublyLinklist link = new DoublyLinklist();
       link.addFirst(5);
        link.addFirst(4);
        link.addFirst(3);
        link.addFirst(2);
        link.addFirst(1);
        link.addFirst(0);
        link.addLast(6);
        link.addLast(7);
        link.addLast(8);
       link.addIndex(10,1);
        link.display();

    }
}
