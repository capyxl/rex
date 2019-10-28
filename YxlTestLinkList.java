/**
 * @ClassName YxlTestLinkNode
 * @auther REX
 * @DATE 2019/10/28 9:54
 * @Version 1.0
 **/
public class YxlTestLinkList {
    public static void main(String[] args) {
        YxlLinkList link = new YxlLinkList();
        link.addLast(1);
        link.addLast(2);
        link.addLast(3);
        link.addLast(4);
        link.addLast(5);
        link.addLast(6);
        link.addLast(7);
        link.addLast(8);
        link.addLast(9);
        link.addLast(10);
        link.addFirst(0);
        link.display();
        link.addPos(1,1);
        link.display();
       // link.delete(1);
       // link.display();
       // link.deleteSearch(0);
       // link.display();
        link.deleteAll(11);
        link.display();
        link.search(11);
        link.change(111,10);
        link.display();
    }
}
