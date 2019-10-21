/**
 * @ClassName Human
 * @auther REX
 * @DATE 2019/10/21 16:11
 * @Version 1.0
 **/
public class Human {
    public static void main(String[] args) {
        HumanInfo human = new HumanInfo();
        HumanInfo human1 = new HumanInfo(22,170);
        HumanInfo human2 = new HumanInfo(22, 180, 60,"yxl", "男");
        human.show();
        human1.show();
        human2.show();

    }

}
class HumanInfo{
    private int age;
    private String name;
    private String sex;
    private int hight;
    private int weight;
    HumanInfo(){
        age = 23;
        name = "link";
        sex = "男";
        hight = 170;
        weight = 60;
    }
    HumanInfo(int age, int hight){
        this.age = age;
        this.hight = hight;
        this.name = "zelda";
        this.weight = 60;
        this.sex = "女";
    }
    HumanInfo(int age, int hight,int weight, String name, String sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.hight = hight;
        this.weight = weight;
    }
    public void show(){
        System.out.println(name + " \t " + sex + " \t " + hight + " \t " + age + " \t " + weight);
    }


}
