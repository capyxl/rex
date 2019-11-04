package GameOperation;

import Game.GameList;

/**
 * @ClassName Display
 * @auther REX
 * @DATE 2019/11/3 9:49
 * @Version 1.0
 **/
public class Display implements IGameOperation {
    @Override
    public void work(GameList games) {
        System.out.println("=============================================================================");
        System.out.println("即将展示所有游戏信息");
        for (int i = 0; i < games.getUseSize(); i++) {
            System.out.println( games.getGame(i).toString());
        }
        System.out.println("===================================================================================");
        return;
    }
}
