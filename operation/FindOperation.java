package operation;

import book.BookList;

import java.util.Scanner;

/**
 * @ClassName FindOperation
 * @auther REX
 * @DATE 2019/10/31 14:35
 * @Version 1.0
 **/
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
        System.out.println("请输入要查找的书名");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("==========================================");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if(name.equals(bookList.getBooks(i).getName())){
                System.out.println("已找到");
                System.out.println("==============================");
                System.out.println(bookList.getBooks(i).toString());
                return;
            }
        }
        System.out.println("未找到");
    }
}
