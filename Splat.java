//绘制几个圆（随机位置，大小），使用构造方法
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Splat{

    public static void main(String[] args) {
      
        //设置框架
        JFrame frame = new JFrame("画圈圈");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //载入面板
        frame.getContentPane().add(new SplatPanel());
        frame.pack();
        frame.setVisible(true);
    }


    //面板设置
    static class SplatPanel extends JPanel{

        private Circle c1, c2, c3, c4, c5;

        
        public SplatPanel(){
            
            int a, b, c, d, e, x1, x2, x3, x4, x5, y1, y2, y3, y4, y5;

            Random ra = new Random();

              //圆的随机半径，坐标
             a = ra.nextInt(100);
             b = ra.nextInt(100);
             c = ra.nextInt(100);
             d = ra.nextInt(100);
             e = ra.nextInt(100);
             x1 = ra.nextInt(301);
             x2 = ra.nextInt(301);
             x3 = ra.nextInt(301);
             x4 = ra.nextInt(301);
             x5 = ra.nextInt(301);
             y1 = ra.nextInt(301);
             y2 = ra.nextInt(301);
             y3 = ra.nextInt(301);
             y4 = ra.nextInt(301);
             y5 = ra.nextInt(301);

            c1 = new Circle(a, Color.red, x1, y1);
            c2 = new Circle(b, Color.blue, x2, y2);
            c3 = new Circle(c, Color.green, x3, y3);
            c4 = new Circle(d, Color.yellow, x4, y4);
            c5 = new Circle(e, Color.white, x5, y5);

            setPreferredSize(new Dimension(300, 300));
            setBackground(Color.black);
        }


        public void paintComponent(Graphics page){

            super.paintComponent(page);

            c1.draw(page);
            c2.draw(page);
            c3.draw(page);
            c4.draw(page);
            c5.draw(page);
        }


    }


    static class Circle{
        private int diameter, x, y;
        private Color color;

        public Circle(int size, Color shade, int upperX, int upperY){
            diameter = size;
            color = shade;
            x = upperX;
            y = upperY;
        }


        public void draw(Graphics page){
            page.setColor(color);
            page.fillOval(x, y, diameter, diameter);
        }


       /* public void setDiameter(int size){
            diameter = size;
        }


        public void setColor(Color shade){
            color = shade;
        } 


        public void setX(int upperX){
            x = upperX;
        }


        public void setY(int upperY){
            y = upperY;
        }


        public int getDiameter(){
            return diameter;
        }


        public Color getColor(){
            return color;
        }


        public int getX(){
            return x;
        }


        public int getY(){
            return y;
        }*/



    }
}