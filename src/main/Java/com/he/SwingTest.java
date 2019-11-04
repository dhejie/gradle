package Java.com.he;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ProjectName: gradle
 * @Package: Java.com.he
 * @ClassName: SwingTest
 * @Author: dhejie
 * @CreateDate: 2019/11/4 21:54
 * @UpdateDate: 2019/11/4 21:54
 * @Version: 1.0
 */
public class SwingTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("jFrame");
        JButton jButton = new JButton("my jButton");
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button pressed!");
//            }
//        });
        jButton.addActionListener(
                event -> {System.out.println("Button pressed!");
                    System.out.println("hello word");

                }
        );
//        jButton.addActionListener(
//                (ActionEvent even) ->
//                {System.out.println("Button pressed!");
//                    System.out.println("hello word");
//
//                }
//        );
        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//    Lambda表达式基本结构
//            (param1,param2,param2)->{执行体}
}
