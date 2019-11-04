package GameOperation;

import Game.GameList;

import java.util.Scanner;

/**
 * @ClassName IGameOperation
 * @auther REX
 * @DATE 2019/11/2 13:54
 * @Version 1.0
 **/
public interface IGameOperation {
    Scanner sc = new Scanner(System.in);
    void work(GameList games);
}
