/**
 * @ClassName InstanceCodeBlock
 * @auther REX
 * @DATE 2019/10/21 15:19
 * @Version 1.0
 **/
public class InstanceCodeBlock {
    public static void main(String[] args) {
        Person2 p2 = new Person2();
        p2.show1();
    }

}
class Person2 {
    private int age;
    private String name;
    private String sex;
    public Person2(){
        System.out.println(name + "  " + age + "  " + sex);
    }
    //实例代码块
    {
        this.age = 20;
        this.name = "link";
        this.sex = "男";
    }
    public void show1(){
        System.out.println(name + "  " + sex + "  " + age);
    }

}

