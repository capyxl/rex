//设置一个面板标签显示姓名
import java.awt.*;
import javax.swing.*;

public class PP3_10{
    public static void main(String[] args) {
        
        //设置框架
        JFrame name = new JFrame("姓名");
        name.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //设置标签
        JLabel l1, l2;
        l1 = new JLabel("cap");
        l2 = new JLabel("yxl");

        //设置面板
        JPanel pan = new JPanel();
        pan.setBackground(Color.green);
        pan.setPreferredSize(new Dimension(100,100));
        pan.add(l1);
        pan.add(l2);

        //添加面板
        name.getContentPane().add(pan);
        name.pack();
        name.setVisible(true);

    }

}