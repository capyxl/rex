package user;

import book.BookList;
import operation.IOperation;

import java.util.Scanner;

/**
 * @ClassName User
 * @auther REX
 * @DATE 2019/10/31 11:19
 * @Version 1.0
 **/
public abstract class User {
    public String name;
    public IOperation[] iOperations;
    Scanner scanner = new Scanner(System.in);
    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        this.iOperations[choice].work(bookList);

    }

}
