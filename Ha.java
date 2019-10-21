/**
 * @ClassName Main
 * @auther REX
 * @DATE 2019/10/21 14:45
 * @Version 1.0Pe
**/
public class Ha{
    public static void main(String[] args) {
        Person1 person = new Person1(5,"zelda");
        person.eat();
        person.sleep();
        person.show();
    }
}
class Person1{
    private  int age;
    private String name;
    public Person1(){
        this.name = "hahaha";
        this.age = 18;
    }
    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person1(int age, String name){
        this.name = name;
        this.age = age;
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;

    }

    public String getName() {

        return name;
    }

    public void show(){
        System.out.println("姓名： " + name + "  "+ "年龄:  " + age );
    }

}

