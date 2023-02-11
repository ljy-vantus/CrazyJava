package org.example.ch11_awt.sec03_layout_manager;

import java.awt.*;
import java.awt.event.ActionListener;

public class F_CardLayoutTest {
    Frame f = new Frame("测试窗口");
    String[] names = {"第一张", "第二张", "第三张", "第四张", "第五张"};
    Panel p1 = new Panel();

    public void init() {
        final var c = new CardLayout();
        p1.setLayout(c);
        for (var i = 0; i < names.length; i++) {
            p1.add(names[i], new Button(names[i]));
        }
        var p = new Panel();
        ActionListener listener = e -> {
            switch (e.getActionCommand()) {
                case "上一张":
                    c.previous(p1);
                    break;
                case "下一张":
                    c.next(p1);
                    break;
                case "第一张":
                    c.first(p1);
                    break;
                case "最后一张":
                    c.last(p1);
                    break;
                case "第三张":
                    c.show(p1, "第三张");
                    break;
            }
        };
        // 控制显示上一张的按钮
        var previous = new Button("上一张");
        previous.addActionListener(listener);
        // 控制显示下一张的按钮
        var next = new Button("下一张");
        next.addActionListener(listener);
        // 控制显示第一张的按钮
        var first = new Button("第一张");
        first.addActionListener(listener);
        // 控制显示最后一张的按钮
        var last = new Button("最后一张");
        last.addActionListener(listener);
        // 控制根据Card名显示的按钮
        var third = new Button("第三张");
        third.addActionListener(listener);
        p.add(previous);
        p.add(next);
        p.add(first);
        p.add(last);
        p.add(third);
        f.add(p1);
        f.add(p, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new F_CardLayoutTest().init();
    }

}
