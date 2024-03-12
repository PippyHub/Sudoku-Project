package Main;

import Input.KeyInput;
import Input.MouseInput;

import Paint.*;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public static final int GAME_PANEL_WIDTH = 900;
    public static final int GAME_PANEL_HEIGHT = 900;
    public static final int CELL_COLS = 9;
    public static final int CELL_ROWS = 9;
    public static final int CELL_WIDTH = GAME_PANEL_WIDTH / CELL_COLS;
    public static final int CELL_HEIGHT = GAME_PANEL_HEIGHT / CELL_ROWS;
    KeyInput keyInput;
    MouseInput mouseInput;
    public GamePanel() {
        initInput();
        initPaint();
    }
    public void initInput() {
        keyInput = new KeyInput(this);
        mouseInput = new MouseInput(this);
        addKeyListener(keyInput);
        addMouseListener(mouseInput);
        addMouseMotionListener(mouseInput);
    }
    public void initPaint() {

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        new BackgroundPaint().paint(g);
        new GridPaint().paint(g);
        new NumberPaint(this).paint(g);
    }
}