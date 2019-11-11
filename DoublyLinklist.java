/**
 * @ClassName DoublyLinklist
 * @auther REX
 * @DATE 2019/10/28 19:04
 * @Version 1.0
 **/
class DoublyLinklist {
    public dNode head;
    public dNode last = null;

    public DoublyLinklist() {
        this.head = null;
    }

    //打印链表
    public void display() {
        dNode cur = this.head;
        System.out.print("[ ");
        while (cur != null) {
            System.out.print(cur.data + " ");
            if (cur.next != null) {
                System.out.print(",");
            }
            cur = cur.next;
        }
        System.out.println("]");
    }

    //头插法
    public void addFirst(int data) {
        dNode node = new dNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        } else {
            node.next = head;
            head.prev = node;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        dNode node = new dNode(data);
        if (head == null) {
            this.head = node;
            this.last = node;
        } else {
            this.last.next = node;
            node.prev = last;
            this.last = node;
        }
    }

    //中间插
    public void addIndex(int pos, int data) {
        dNode node = new dNode(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        if (this.head.next == null) {
            if (pos == 0) {
                addFirst(data);
            } else if (pos == 1) {
                addLast(data);
            } else {
                System.out.println("error");
            }
            return;
        }
        //判断位置合法
        dNode cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        System.out.println(count);
        if (pos < 0 || pos > count) {
            System.out.println("下表越界");
            return;
        } else {
            if (pos == 0) {
                addFirst(data);
            } else if (pos == count) {
                addLast(data);
            } else {
                cur = this.head;
                for (int i = 0; i < pos; i++) {
                    cur = cur.next;
                }
                node.next = cur;
                node.prev = cur.prev;
                node.prev.next = node;
                cur.prev = node;

            }
        }
    }

    //删除第一次出现的节点
    public int remove(int key) {
        dNode cur = this.head;
        int oldData = -1;
        while (cur != null) {
            if (cur.data == key) {
                oldData = cur.data;
                if (cur == this.head) {
                    head = cur.next;
                    cur.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur != last) {
                        cur.next.prev = cur.prev;
                    } else {
                        last = cur.prev;
                    }
                    oldData = cur.data;
                }
            }

            cur = cur.next;
        }
        return oldData;
    }
}

class dNode{
    public dNode prev;
    public dNode next;
    public int data;

    public dNode(int data){
        this.data = data;
    }
}