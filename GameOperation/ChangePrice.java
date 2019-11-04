package GameOperation;

import Game.GameList;

/**
 * @ClassName ChangePrice
 * @auther REX
 * @DATE 2019/11/2 14:28
 * @Version 1.0
 **/
public class ChangePrice implements IGameOperation {
    @Override
    public void work(GameList games) {
        System.out.println("请输入要更改价格的游戏名");
        String name = sc.next();
        System.out.println("请输入新价格");
        int price2 = sc.nextInt();
        for (int i = 0; i < games.getUseSize(); i++) {
            if(name.equals(games.getGame(i).getName())){
               games.getGame(i).setPrice(price2);
            return;
            }
        }
        System.out.println("库中没有此游戏");
        System.out.println("===================================================================================");
        return;
    }
}
