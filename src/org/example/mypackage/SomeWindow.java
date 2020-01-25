package org.example.mypackage;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.FormatFlagsConversionMismatchException;

public class SomeWindow extends Frame {


    public SomeWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //super.windowClosed(e);
                System.exit(0);
            }
        });
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sanSerifLarge = new Font("SanSerif", Font.BOLD, 18);
        Font sanSerifSmall = new Font("SanSerif", Font.BOLD, 12);
        g.setFont(sanSerifLarge);
        g.drawString("I will be the best developer", 60, 60);
        g.setFont(sanSerifSmall);
        g.drawString("it will happen in 2020", 60, 100);
    }
}
