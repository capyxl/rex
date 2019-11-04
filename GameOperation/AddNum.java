package GameOperation;

import Game.GameList;

/**
 * @ClassName AddNum
 * @auther REX
 * @DATE 2019/11/2 14:11
 * @Version 1.0
 **/
public class AddNum implements IGameOperation{
    @Override
    public void work(GameList games) {
        System.out.println("请输入要更改库存数量的游戏名");
        String name = sc.next();
        System.out.println("请输入要增加的数（减少请输入负数）");
        int increase = sc.nextInt();
        for (int i = 0; i < games.getUseSize(); i++) {
            if(name.equals(games.getGame(i).getName())){
                int num = games.getGame(i).getNum();
                games.getGame(i).setNum(num + increase);
            return;
            }
        }
        System.out.println("库中没有此游戏");
        System.out.println("===================================================================================");
        return;
    }
}
