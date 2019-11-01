package operation;

import book.BookList;

import java.util.Scanner;

/**
 * @ClassName BrrowOperation
 * @auther REX
 * @DATE 2019/10/31 14:05
 * @Version 1.0
 **/
public class BrrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        System.out.println("请输入想要借阅的图书名");
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();
        int i = 0;
        for (; i < bookList.getUsedSize(); i++) {
            System.out.println(bookList.getBooks(i).getName());
            if(name.equals(bookList.getBooks(i).getName())){
                System.out.println("借阅成功");
                bookList.getBooks(i).setBorrowed(true);
                return;
            }
        }
        System.out.println("没有找到书籍");

    }
}
