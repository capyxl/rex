package GameUser;

import GameOperation.*;

/**
 * @ClassName NormalUser
 * @auther REX
 * @DATE 2019/11/3 10:22
 * @Version 1.0
 **/
public class NormalUser extends User {
    public NormalUser(String name) {
        this.name = name;
        this.Igame = new IGameOperation[]{
                new Exit(),
                new Display(),
                new Find(),
                new Buy()
        };
    }
    @Override
    public int menu() {
        System.out.println("==hello "  +  this.name + "欢迎使用===");
        System.out.println("1.展示所有游戏");
        System.out.println("2.查找游戏");
        System.out.println("3.购买游戏");
        System.out.println("0.退出系统");
        System.out.println("===================================================");
        System.out.println("请输入您的选择");
        int choice = sc.nextInt();
        return choice;
    }
}
