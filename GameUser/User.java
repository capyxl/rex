package GameUser;

import Game.GameList;
import GameOperation.IGameOperation;

import java.util.Scanner;

/**
 * @ClassName User
 * @auther REX
 * @DATE 2019/11/3 9:57
 * @Version 1.0
 **/
public abstract class User {
    public String name;
    public IGameOperation[] Igame;
    Scanner sc = new Scanner(System.in);

    public abstract int menu();

    public void doIgame(int choice, GameList games){
        this.Igame[choice].work(games);
    }
}
