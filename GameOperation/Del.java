package GameOperation;

import Game.GameList;

/**
 * @ClassName Del
 * @auther REX
 * @DATE 2019/11/2 14:21
 * @Version 1.0
 **/
public class Del implements IGameOperation {
    @Override
    public void work(GameList games) {
        System.out.println("请输入要删除游戏名");
        String gname = sc.nextLine();
        for (int i = 0; i < games.getUseSize(); i++) {
            if(gname.equals(games.getGame(i).getName())){
                if(i == games.getUseSize() - 1){
                    games.setUseSize(games.getUseSize() - 1);
                    System.out.println("删除成功");
                    return;
                }
                for (int j = i; j < games.getUseSize() - 1; j++) {
                    games.setGame(games.getGame(j + 1),j);
                    if(j == games.getUseSize() - 2){
                        games.setGame(games.getGame(j + 1),j);
                        games.setUseSize(games.getUseSize() - 1);
                        System.out.println("删除成功");
                        return;
                    }
                }
            }
        }
        System.out.println("库中没有此游戏");
        System.out.println("=========================================================================");
        return;
    }
}
