package GameOperation;

import Game.GameList;

/**
 * @ClassName Find
 * @auther REX
 * @DATE 2019/11/3 9:46
 * @Version 1.0
 **/
public class Find implements IGameOperation {
    @Override
    public void work(GameList games) {
        System.out.println("请输入要查找的游戏名");
        String name = sc.next();
        for (int i = 0; i < games.getUseSize(); i++) {
            if(name.equals(games.getGame(i).getName())){
                System.out.println(games.getGame(i).toString());
                return;
            }
        }
        System.out.println("库中没有此游戏");
        System.out.println("===================================================================================");
        return;
    }
}
