package GameOperation;

import Game.GameList;

/**
 * @ClassName Exit
 * @auther REX
 * @DATE 2019/11/3 10:05
 * @Version 1.0
 **/
public class Exit implements IGameOperation {
    @Override
    public void work(GameList games) {
        System.out.println("即将退出系统");
        System.out.println("退出成功");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
