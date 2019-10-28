/**
 * @ClassName YxlLinkList
 * @auther REX
 * @DATE 2019/10/28 9:50
 * @Version 1.0
 **/
class YxlLinkList {
    public Node1 head;


    //显示链表
    public void display(){
        Node1 cur = this.head;
        System.out.print("[ ");
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println("]");
    }

    //链表增
    //头插
    public void addFirst(int data){
        Node1 node = new Node1(data);
        if(this.head == null){
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;

    }

    //尾插
    public void addLast(int data){
        Node1 node = new Node1(data);
        Node1 cur = this.head;
        if(this.head == null){
            this.head = node;
        }else{
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //判断下标是否越界
    public int judge(){
        Node1 cur = this.head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
       return count;
    }

    //中间插
    public void addPos(int pos,int data){
        Node1 node = new Node1(data);
        if(this.head == null){
            this.head = node;
            return;
        }
        //判断下标是否越界
        if(pos < 0 || pos > judge()){
            System.out.println("下标越界，最小值 0 ，最大值 " + judge());
            return;
        }
        if(pos == 0){
            node.next = this.head;
            this.head = node;
        }else{
            Node1 cur = this.head;
            for (int i = 0; i < pos - 1; i++) {
                cur = cur.next;
            }
            node.next = cur.next;
            cur.next = node;

        }
    }

    //删除
    public void delete(int pos){
        //链表为空
        if(this.head == null){
            return;
        }
        //判断下标是否越界
        if(pos < 0 || pos > (judge() - 1)){
            System.out.println("下标越界，最小值 0 ， 最大值" + (judge() - 1));
        return;
        }
        if(pos == 0){
            this.head = this.head.next;
        }else{
            Node1 prev = this.head;
            Node1 cur = prev.next;
            for (int i = 0; i < pos - 1; i++) {
                cur = cur.next;
                prev = prev.next;
            }
            prev.next = cur.next;
        }

    }

    //删除第一个指定元素
    public void deleteSearch(int data){
        Node1 cur = this.head;
        int pos = 0;
        while(cur.data != data){
            cur = cur.next;
            pos++;
            if(cur == null){
                System.out.println("没找到可删除元素");
                return;
            }
        }
        delete(pos);

    }

    //删除所有查找元素
    public void deleteAll(int data){
        Node1 cur = this.head;
        int pos = 0;
        //记录删除了几次
        int ret = 0;
        while(cur != null){
            pos = 0;
            //忘记重置cur的话会无限循环
            cur = this.head;
            while(cur.data != data){
                cur = cur.next;
                pos++;
                if(cur == null){
                    break;
                }
            }
            //找到元素后就删除
            if(cur != null){
            if(cur.data == data){
                delete(pos);
                ret++;
            }
            }
            //判断链表中有没有可删除元素
            if(ret == 0){
                System.out.println("没找到可删除元素");
            }
        }
    }

    //查找元素
    public void search(int data){
        Node1 cur = this.head;
        int pos = 0;
        //记录找到次数
        int ret = 0;
        while(cur != null){
            if(cur.data == data){
                System.out.println("你要找的数在第 " + pos + " 位" );
                ret++;
            }
            cur = cur.next;
            pos++;
        }
        if(ret == 0){
            System.out.println("没找到");
        }
    }

    //修改元素
    public void change(int data, int data1){
        Node1 cur = this.head;
        int ret = 0;
        if(cur == null){
            return;
        }
        while(cur != null){
            if(cur.data == data){
                cur.data = data1;
                ret++;
            }
            cur = cur.next;
        }
        if(ret == 0){
            System.out.println("没找到要修改的元素");
        }
    }

}

class Node1{
    public Node1 next = null;
    public int data = 0;
    public Node1(int data){
        this.data = data;
    }
}
