package org.example.ch11_awt.sec03_layout_manager;

import java.awt.*;

import static java.awt.BorderLayout.NORTH;

public class D_GridLayoutTest {
    public static void main(String[] args) {
        var f = new Frame("计算器");
        var p1 = new Panel();
        p1.add(new TextField(30));
        f.add(p1, NORTH);
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(3, 5, 4, 4));
        String[] name={
                "0", "1", "2", "3",
                "4", "5", "6", "7",
                "8", "9", "+", "-",
                "*", "/", "." };
        // 向Panel中依次添加15个按钮
        for (int i = 0; i < name.length; i++) {
            p2.add(new Button(name[i]));
        }
        // 默认将Panel对象添加到Frame窗口的中间
        f.add(p2);
        f.pack();
        f.setVisible(true);
    }
}
