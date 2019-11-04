package Game;

/**
 * @ClassName Game
 * @auther REX
 * @DATE 2019/11/2 13:19
 * @Version 1.0
 **/
public class Game {
    private String name;
    private String author;
    private String type;
    private int price;
    private int num;


    public Game(String name, String author, String type, int price, int num) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
        this.num = num;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}

