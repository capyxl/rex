package user;

import operation.*;

/**
 * @ClassName NomorUser
 * @auther REX
 * @DATE 2019/10/31 11:19
 * @Version 1.0
 **/
public class NomorUser extends User{

    public NomorUser(String name){

            this.name = name;
            this.iOperations = new IOperation[] {
                    new ExitOperation(),
                    new FindOperation(),
                    new BrrowOperation(),
                    new ReturnOperation(),
            };
        }


    @Override
    public int menu() {
        System.out.println("==hello "  +  this.name + "欢迎使用===");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出");
        System.out.println("===================================================");
        System.out.println("请输入你的选择");
        int choice = scanner.nextInt();
        return choice;
    }
}
