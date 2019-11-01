package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @ClassName AddOperation
 * @auther REX
 * @DATE 2019/10/31 11:59
 * @Version 1.0
 **/
public class AddOperation implements IOperation {
    @Override
    public void work(BookList booklist) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入书名");
        String name = sc.next();
        System.out.println("请输入作者");
        String auther = sc.next();
        System.out.println("请输入价格");
        int price = sc.nextInt();
        System.out.println("请输入类别");
        String type = sc.next();

        Book book = new Book(name, auther,price,type, false);
        booklist.setBooks(booklist.getUsedSize(),book);
        booklist.setUsedSize(booklist.getUsedSize() + 1);
    }
}
