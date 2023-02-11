package org.example.ch11_awt.sec03_layout_manager;

import java.awt.*;

import static java.awt.BorderLayout.*;

public class C_BorderLayoutTest2 {
    public static void main(String[] args) {
        var f = new Frame("测试窗口");
        // 设置Frame容器使用BorderLayout布局管理器
        f.setLayout(new BorderLayout(30, 5));
        f.add(new Button("南"), SOUTH);
        f.add(new Button("北"), NORTH);
        // 创建一个Panel对象
        var p = new Panel();
        // 向Panel对象中添加两个组件
        p.add(new TextField(20));
        p.add(new Button("单击我"));
        // 默认添加到中间区域中，向中间区域添加一个Panel容器
        f.add(p);
        f.add(new Button("东"), EAST);
        // 设置窗口为最佳大小
        f.pack();
        f.setVisible(true);
    }
}
