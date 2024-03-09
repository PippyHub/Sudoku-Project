package Main;

import Input.KeyInput;
import Input.MouseInput;

import Paint.Grid;
import Paint.Background;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public static final int GAME_PANEL_WIDTH = 900;
    public static final int GAME_PANEL_HEIGHT = 900;
    public static final int COLS = 9;
    public static final int ROWS = 9;

    KeyInput keyInput;
    MouseInput mouseInput;
    public GamePanel() {
        keyInput = new KeyInput(this);
        mouseInput = new MouseInput(this);
        addKeyListener(keyInput);
        addMouseListener(mouseInput);
        addMouseMotionListener(mouseInput);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        new Background().paint(g);

        new Grid().paint(g);
    }
}