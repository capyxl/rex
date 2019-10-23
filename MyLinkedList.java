/**
 * @ClassName MyLinkedList
 * @auther REX
 * @DATE 2019/10/23 8:59
 * @Version 1.0
 **/
class MyLinkedList {
    public Node head;

    //头插(不带头)
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node cur = this.head;
            //找尾巴
            while (cur != null) {
                cur = cur.next;
            }
            cur.next = node;

        }
    }

    public Node searchIndex(int pos) {
        Node cur = this.head;
        for (int i = 0; i < pos - 1; i++) {

            cur = cur.next;
        }
        return cur;
    }

    //计算最大允许插入下标
    public int nodeNum() {
        int count = 0;
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
            count++;
        }
        count++;
        return count;
    }

    public void addIndex(int pos, int data) {
        Node node = new Node(data);
        System.out.println("你所插入下标:  " + pos + "  " + "  最大允许下标  " + nodeNum() + " 最小允许下标  0");
        if (pos < 0 || pos > nodeNum()) {
            System.out.println("下标越界    error");
        } else if (pos == 0) {
            //头插
            this.head = node;
        } else {//插到中间或者尾插
            Node cur = searchIndex(pos);
            node.next = cur.next;
            cur.next = node;
        }

    }

    //删除所有指定元素
    public void removeAllKey(int data) {
        Node cur = this.head.next;
        Node prev = this.head;
        int i = 0;
        //删除元素
        while (prev.next != null) {
            //判断是否有元素
            if (cur.data == data) {
                //删除元素
                prev.next = cur.next;
                cur = prev.next;
                i++;
            } else {
                //不用删除元素
                cur = cur.next;
                prev = prev.next;
            }
        }
            //判断头元素是否需要删除
            if (this.head.data == data) {
                this.head = this.head.next;
            }
            //不用删除元素
            if(i == 0){
                System.out.println("链表中没有" + data);
            }

    }


        public void display () {
        if(this.head == null){
            System.out.println("null");
        }else {
            Node cur = this.head;
            System.out.print("[ ");
            while (cur.next != null) {
                System.out.print(cur.data + "  ");
                cur = cur.next;
            }
            System.out.println(cur.data + " ]");
        }
        }


        //反转链表
        public void reverse() {
            Node prev = null;
            Node cur = this.head;
            Node nextcur = null;
            //链表为空
            if (cur == null) {
                System.out.println("error");
                //只有一个元素
            } else if (this.head.next == null) {
                System.out.println("only one");
                //只有两个元素
            } else if (this.head.next.next == null) {
                cur = this.head.next;
                prev = this.head;
                cur.next = prev;
                prev.next = null;
                this.head = cur;
            } else {
                //两个以上
                cur = this.head.next;
                prev = head;
                nextcur = cur.next;
                while (cur.next != null) {
                    this.head.next = null;
                    cur.next = prev;
                    prev = cur;
                    cur = nextcur;
                    nextcur = nextcur.next;
                }
                cur.next = prev;
                this.head = cur;
            }
        }

    //求中间节点则值,快慢指针
    public Node middle(){
        Node slow = this.head;
        Node fast = this.head;
        if(this.head == null){
            System.out.println("error");
            return null;
        }else if(this.head.next == null){
            return this.head;
        }else if(this.head.next.next == null){
            return this.head.next;
        }else{
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println(slow.data);
            return slow;
        }

    }
    //输出倒数第k个数的值
    public Node findKthToTail(int k) {
    /*    if(k < 0 || k > nodeNum()){
        return null;
         }
        Node fast = this.head;
        Node slow = this.head;
            for (int i = 0; i < k - 1; i++) {
                fast = fast.next;
            }
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
        }*/
        if (head == null || k == 0) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (k - 1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }


        //按照给定基准，小的在左，大的在右
    public Node partition(int x){
        Node beforStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;
        Node cur = this.head;

        while(cur.next != null){
            Node curNext = cur.next;
            cur.next = null;
            if(cur.data < x){
                if(beforStart == null){
                    beforStart = cur;
                    beforeEnd = cur;
                }else{
                    beforeEnd.next = cur;
                    beforeEnd = cur;
                }
            }else{
                if(afterStart == null){
                    afterStart = cur;
                    afterEnd = cur;
                }else{
                    afterEnd.next = cur;
                    afterEnd = cur;
                }

            }
            cur = curNext;
        }
        if(beforStart == null){
            return afterStart;
        }
        beforeEnd.next = afterStart;
        return  beforStart;
    }

}


      class Node {
          public Node next = null;
          public int data = 0;

          public Node(int data) {
              this.data = data;
          }
      }
