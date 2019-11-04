package GameOperation;

import Game.GameList;

/**
 * @ClassName Buy
 * @auther REX
 * @DATE 2019/11/3 9:52
 * @Version 1.0
 **/
public class Buy implements IGameOperation {
    @Override
    public void work(GameList games) {
        System.out.println("请输入要购买的游戏名");
        String name = sc.next();
        for (int i = 0; i < games.getUseSize(); i++) {
            if(name.equals(games.getGame(i).getName())){
                games.getGame(i).toString();
                System.out.println("是否要购买？ 是 回复 1 ， 不是回复 0");
                int j = sc.nextInt();
                if(j == 1){
                    int num2 = games.getGame(i).getNum();
                    System.out.println("购买成功");
                    games.getGame(i).setNum(num2 - 1);
                    return;
                }else{
                    break;
                }
            }
        }
        System.out.println("库中没有此游戏");
        System.out.println("===================================================================================");
        return;
    }
}
