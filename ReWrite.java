/**
 * @ClassName ReWrite
 * @auther REX
 * @DATE 2019/10/21 15:33
 * @Version 1.0
 **/
public class ReWrite {
    public static void main(String[] args) {
        Person3 p3 = new Person3();
        p3.show2("link", 18);
        System.out.println(p3);
    }
}

class Person3{
    private String name;
    private int age;
    public void show2(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name + "   " + age);
    }
   @Override
    public String toString(){
        return name + "  " + age;
   }

}
