package operation;

import book.BookList;

import java.util.Scanner;

/**
 * @ClassName DelOperation
 * @auther REX
 * @DATE 2019/10/31 16:51
 * @Version 1.0
 **/
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println();
        System.out.println("删除图书");
        System.out.println("==================================");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if(name.equals(bookList.getBooks(i).getName())){
                for (int j = i; j < bookList.getUsedSize() - 1; j++) {
                    bookList.setBooks(i, bookList.getBooks(i + 1));
                }
            }

        }
        bookList.setUsedSize(bookList.getUsedSize() - 1);
    }
}
