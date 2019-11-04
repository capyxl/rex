package Game;

/**
 * @ClassName Gamelist
 * @auther REX
 * @DATE 2019/11/2 13:27
 * @Version 1.0
 **/
public class GameList {
    private Game[] games = new Game[100];
    private int UseSize = 5;

    public GameList(){
        games[0] = new Game("塞尔达传说旷野之息","nintindo","Switch",300,10);
        games[1] = new Game("异度神剑2","nintindo","Switch",455,20);
        games[2] = new Game("超级马里奥 奥德赛","nintindo","Switch",300,12);
        games[3] = new Game("God Of War","SIE","PS4",270,15);
        games[4] = new Game("血源诅咒","SIE","PS4", 200, 30);
    }

    public int getUseSize() {
        return UseSize;
    }

    public void setUseSize(int useSize) {
        UseSize = useSize;
    }

    public Game getGame(int pos){
        return games[pos];
    }

    public void setGame(Game game, int UseSize){
        this.games[UseSize] = game;
    }
}
