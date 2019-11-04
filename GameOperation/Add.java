package GameOperation;

import Game.Game;
import Game.GameList;


/**
 * @ClassName Add
 * @auther REX
 * @DATE 2019/11/2 13:53
 * @Version 1.0
 **/
public class Add implements IGameOperation{
    @Override
    public void work(GameList games) {
        System.out.println("请输入游戏名");
        String name = sc.nextLine();
        System.out.println("请输入作者");
        String auther = sc.next();
        System.out.println("请输入平台类型");
        String type = sc.next();
        System.out.println("请输入价格");
        int price = sc.nextInt();
        System.out.println("请输入新增库存量");
        int num = sc.nextInt();

        Game game = new Game(name,auther,type,price,num);
        games.setGame(game,games.getUseSize());
        games.setUseSize(games.getUseSize() + 1);
        System.out.println("===================================================================================");
    }
}
