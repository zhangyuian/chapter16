package com.hspedu.homework;

import javax.swing.*;

public class HspTankGame02 extends JFrame {//JFrame就是面板

    //定义MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {

        HspTankGame02 hspTankGame01 = new HspTankGame02();

    }

    public HspTankGame02() {
        mp = new MyPanel();
        this.add(mp);//把面板加入到绘图区，里面会自动调用paint方法
        this.setSize(1000, 750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}