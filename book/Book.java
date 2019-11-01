package book;

/**
 * @ClassName Book
 * @auther REX
 * @DATE 2019/10/31 10:50
 * @Version 1.0
 **/
public class Book {

        private String name;//书籍名称
        private String author;//书籍作者
        private int price;//价格
        private String type;//类型
        private boolean isBorrowed;//是否已经被借出

        public Book(String name, String author,
                    int price, String type, boolean b) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.type = type;
            this.isBorrowed = b ;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isBorrowed() {
            return isBorrowed;
        }

        public void setBorrowed(boolean borrowed) {
            isBorrowed = borrowed;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    ", type='" + type + '\'' +
                    (isBorrowed == true ? "已经被借出" :"没有被借出") +
                    '}';
        }
    }


