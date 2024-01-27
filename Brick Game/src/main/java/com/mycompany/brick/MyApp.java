package com.mycompany.brick;

import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyApp extends JFrame implements KeyListener {

    private StartScreen startScreen;
    private GamePlay gamePlay;

    private enum GameState {
        START_SCREEN,
        GAME_PLAY
    }

    private GameState gameState;

    public MyApp() {
        startScreen = new StartScreen();
        gamePlay = new GamePlay();
        gameState = GameState.START_SCREEN;

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        setBounds(10, 10, 700, 600);
        setTitle("BrickBreaker");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void startGame() {
        gameState = GameState.GAME_PLAY;
        remove(startScreen);
        add(gamePlay);
        revalidate();
        repaint();
        gamePlay.requestFocusInWindow();
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER && gameState == GameState.START_SCREEN) {
            startGame();
        }
    }

    public void keyTyped(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        MyApp obj = new MyApp();
        obj.setVisible(true);
        obj.add(obj.startScreen);
    }
}
