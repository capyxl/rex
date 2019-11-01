package operation;

import book.BookList;

/**
 * @ClassName DisplayOperation
 * @auther REX
 * @DATE 2019/10/31 12:22
 * @Version 1.0
 **/
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("展示所有书籍");
        System.out.println("========================================");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            System.out.println(bookList.getBooks(i).toString());
        }
        System.out.println("显示完毕");
    }
}
