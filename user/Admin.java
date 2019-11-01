package user;

import operation.*;

/**
 * @ClassName Admin
 * @auther REX
 * @DATE 2019/10/31 11:18
 * @Version 1.0
 **/
public class Admin extends User{
    public Admin(String name){
        this.name = name;
        this.iOperations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new DelOperation(),
                new AddOperation(),
                new DisplayOperation()
        };
    }
    @Override
    public int menu()
    {
        System.out.println("==hello "  +  this.name + "欢迎使用===");
        System.out.println("1.查找图书");
        System.out.println("2.删除图书");
        System.out.println("3.新增图书");
        System.out.println("4.展示图书");
        System.out.println("0.退出");
        System.out.println("===================================================");
        System.out.println("请输入你的选择");
        int choice = scanner.nextInt();
        return choice;
    }
}
