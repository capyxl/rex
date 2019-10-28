import java.util.Arrays;

/**
 * @ClassName YxlArrayLink
 * @auther REX
 * @DATE 2019/10/26 10:07
 * @Version 1.0
 **/
//顺序表
class YxlArrayLink {
    private int[] elem;
    private int useSize;
    private final int CAPATICITY = 10;

    public YxlArrayLink() {
        this.elem = new int[CAPATICITY];
        this.useSize = 0;
    }


    //判断是否溢出
    public boolean isFUll() {
        return this.elem.length == this.useSize;
    }

    //打印数组元素
    public void display(){
        System.out.print("[ ");
        for (int i = 0; i < useSize; i++) {
            System.out.print(elem[i] + " ");
            if(i < useSize - 1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    //插入数据
    public void insert(int pos, int data){
        //判断能否插入
        if(pos < 0 || pos > useSize){
            System.out.println("输入下标不能插入，最小允许下标 0，最大允许下表" + useSize);
            return;
        }
        //判断是否溢出
        if(isFUll()){
           this.elem =  Arrays.copyOf(this.elem, this.elem.length * 2);
        }
        //头插或给中间插入
        if(pos < useSize){
            for (int i = useSize - 1; i >= pos ; i--) {
                this.elem[i + 1] = this.elem[i];
            }
            this.elem[pos] = data;
        }else{
            //尾插
            this.elem[pos] = data;
        }
        this.useSize++;
    }


    //删除元素
    public void delete(int pos){
        //判断位置是否合法
        if(pos < 0 || pos >= useSize){
            System.out.println("输入下标不能插入，最小允许下标 0，最大允许下表" + (useSize - 1));
            return;
        }
        //删除头和中间
        if(pos < this.useSize - 1){
            for (int i = pos; i < useSize - 1; i++) {
                this.elem[i] = this.elem[i + 1];
            }
        }
        useSize--;
    }

    //删除关键字
    public void deletesearch(int search){
        for (int i = 0; i < useSize; i++) {
            if(elem[i] == search){
                delete(i);
                i = 0;
            }
        }
    }

    //删除第一次出现的关键字
    public void deleteOne(int search){
        for (int i = 0; i < useSize; i++) {
            if (this.elem[i] == search){
                delete(i);
                break;
            }
        }
    }

    //查询关键字位置
    public void search(int data){
        //定义变量记录，判断能否找到
        int ret = 0;
        for (int i = 0; i < useSize; i++) {
            if(elem[i] == data){
                System.out.print(i + " ");
                ret++;
            }
        }
        System.out.println();
        //没找到
        if(ret == 0){
            System.out.println("没找到");
        }

    }

    //修该指定位置的数
    public void changeSet(int pos, int data){
        //判断位置
        if(pos < 0 || pos >= useSize){
            System.out.println("输入下标不能插入，最小允许下标 0，最大允许下表" + (useSize - 1));
            return;
        }
        elem[pos] = data;

    }

    //修改所有元素
    public void changeAll(int data,int datac){
        for (int i = 0; i < useSize; i++) {
            if(elem[i] == data){
                elem[i] = datac;
            }
        }
    }

}