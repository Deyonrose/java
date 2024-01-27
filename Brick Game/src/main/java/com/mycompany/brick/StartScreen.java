package com.mycompany.brick;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class StartScreen extends JPanel {

    public void paint(Graphics g) {
        
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());

       
        g.setColor(Color.white);
        g.setFont(new Font("serif", Font.BOLD, 30));
        g.drawString("Brick Breaker", 250, 200);

        g.setFont(new Font("serif", Font.BOLD, 20));
        g.drawString("Press Enter to Start", 270, 300);
    }
}
