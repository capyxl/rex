package operation;

import book.BookList;

/**
 * @ClassName ExitOperation
 * @auther REX
 * @DATE 2019/10/31 17:26
 * @Version 1.0
 **/
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
    }
}
