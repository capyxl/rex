import java.util.Arrays;

/**
 * @ClassName MyArrayList
 * @auther REX
 * @DATE 2019/10/22 10:34
 * @Version 1.0
 **/
class MyArrayList {
    private int[] elem;
    private int usedSize;
    private final int CAPACITY = 10;

    public MyArrayList() {
        this.elem = new int[CAPACITY];
        this.usedSize = 0;
    }

    private boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    public void display() {
       // System.out.println(Arrays.toString(this.elem));
       // System.out.println(usedSize);
        System.out.print("[ ");
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]);
            if (i < this.usedSize - 1) {
                System.out.print(" , ");
            }
        }
        System.out.print("]");
        System.out.println();
    }


    //插入数据
    public void add(int pos, int data) {
        //判断能否插入
        if (pos < 0 || pos > usedSize) {
            System.out.println("error");
        } else {

            //判断是否需要扩容
            if (isFull()) {
                this.elem = Arrays.copyOf(this.elem, this.elem.length * 2);
            }
           // System.out.println(Arrays.toString(this.elem));
            //移动pos到之后的数据,从后往前移动
            for (int i = usedSize - 1; i >= pos; i--) {
                this.elem[i + 1] = this.elem[i];
            }
            //插入数据
            this.elem[pos] = data;
            this.usedSize++;
           // System.out.println(usedSize);
        }
    }


        //判断是否包含元素
        public void search ( int data){
            int i = 0;
            for (int j = 0; j < usedSize; j++) {
                if (this.elem[j] == data) {
                    i++;
                }

            }
            if (i > 0) {
                System.out.println("数组中有" + i + " 个需要查找的数");
            } else {
                System.out.println("没找到");
            }

        }

        //查找对应位置
        public void toFind ( int data){
            int i = 0;
            for (int j = 0; j < usedSize; j++) {
                if (this.elem[j] == data) {
                    i++;
                    System.out.println("要找的数在第 " + j + " 位");
                }
            }
            if (i == 0) {
                System.out.println("没找到");
            }
        }

        //获取pos位置的元素
        public void getPos ( int pos){
            if (pos < 0 || pos > usedSize) {
                System.out.println("error");
            } else {
                System.out.println("第" + pos + " 位的元素是 " + elem[pos]);
            }
        }

        //获取顺序表长度
        public int sizeOfArray () {
            return usedSize;
        }

        //清空顺序表
        public void clearArray () {
            for (int i = 0; i < usedSize - 1; i++) {
                this.elem[i] = 0;
            }
            this.usedSize = 0;
        }

        //删除第一次出现的关键字key
        public void deleteKey(int key){
            int de = -1;
            for (int i = 0; i < usedSize; i++) {
                if (this.elem[i] == key) {
                    de = i;
                    break;
                }
            }

            //考虑能否找到
            if (de == -1) {
                System.out.println("没找到");
            } else {
                //判断尾插
                if (de == usedSize - 1) {
                    usedSize--;
                } else {
                    for (int i = de; i < usedSize - 1; i++) {
                        this.elem[i] = this.elem[i + 1];
                    }
                    usedSize--;
                }
            }

        }


    }






