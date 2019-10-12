//一个框架两个面板，第一个面板两幅图片，面板固定，第二个面板两幅图不固定
import java.awt.*;
import javax.swing.*;

public class PP3_11{
    public static void main(String[] args) {
        
        JFrame f1 = new JFrame("capyxl");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        ImageIcon cap = new ImageIcon("capyxl.jpg");


        JLabel l1,l2,l3,l4;
        l1 = new JLabel(cap);
        l2 = new JLabel(cap);
        l3 = new JLabel(cap);
        l4 = new JLabel(cap);


        JPanel p1,p2,p3;
        p1 = new JPanel();
        p1.setBackground(Color.cyan);
        p1.setPreferredSize(new Dimension(400 , 400));
        p1.add(l1);
        p1.add(l2);
        p2 = new JPanel();
        p2.setBackground(Color.blue);
        p2.add(l3);
        p2.add(l4);
        p3 = new JPanel();
        p3.setBackground(Color.red);
        p3.add(p1);
        p3.add(p2);


        f1.getContentPane().add(p3);
        f1.pack();
        f1.setVisible(true);

    }
}