package book;

/**
 * @ClassName BookList
 * @auther REX
 * @DATE 2019/10/31 10:52
 * @Version 1.0
 **/
public class BookList {

        private Book[] books = new Book[100];
        private int usedSize;


        public BookList() {
            books[0] = new Book("Java编程思想","AUT",12,"学习",false);
            books[1] = new Book("Java核心卷一","BUT",15,"学习",false);
            books[2] = new Book("TCP/IP","PTO",21,"学习",false);
            this.usedSize = 3;
        }

        public Book getBooks(int pos){
            Book book = books[pos];
            return book;
        }

        public void setBooks(int useSize,Book book){
            this.books[useSize] = book;
        }

        public int getUsedSize() {
            return usedSize;
        }

        public void setUsedSize(int usedSize) {
            this.usedSize = usedSize;
        }


    }


