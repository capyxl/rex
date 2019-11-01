package operation;

import book.BookList;

import java.util.Scanner;

/**
 * @ClassName ReturnOperation
 * @auther REX
 * @DATE 2019/10/31 14:43
 * @Version 1.0
 **/
public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
            System.out.println("归还图书");
            System.out.println("请输入想要归还的图书名");
            Scanner sc = new Scanner(System.in);
            String name  = sc.nextLine();
            int i = 0;
            for (; i < bookList.getUsedSize(); i++) {
                System.out.println(bookList.getBooks(i).getName());
                if(name.equals(bookList.getBooks(i).getName())){
                    System.out.println("归还成功");
                    bookList.getBooks(i).setBorrowed(false);
                    return;
                }
            }
            System.out.println("图书馆没有此书籍");

        }
    }

