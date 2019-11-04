package GameUser;

import GameOperation.*;

/**
 * @ClassName Master
 * @auther REX
 * @DATE 2019/11/3 10:07
 * @Version 1.0
 **/
public class Master extends User {


    public Master(String name) {
        this.name = name;
        this.Igame = new IGameOperation[]{
                new Exit(),
                new Display(),
                new Add(),
                new Del(),
                new AddNum(),
                new ChangePrice(),
                new Find()
        };
    }
        @Override
        public int menu() {
            System.out.println("==hello "  +  this.name + "欢迎使用===");
            System.out.println("1.展示所有游戏");
            System.out.println("2.新增游戏");
            System.out.println("3.删除游戏");
            System.out.println("4.增加游戏数目");
            System.out.println("5.更改游戏价格");
            System.out.println("6.查找游戏");
            System.out.println("0.退出系统");
            System.out.println("===================================================");
            System.out.println("请输入您的选择");
            int choice = sc.nextInt();
            return choice;
        }


    }

