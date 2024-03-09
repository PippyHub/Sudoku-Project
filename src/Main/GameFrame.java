package Main;

import static Main.GamePanel.GAME_PANEL_HEIGHT;
import static Main.GamePanel.GAME_PANEL_WIDTH;

import javax.swing.*;
import java.awt.*;
public class GameFrame extends JFrame {
    public GameFrame(GamePanel gamePanel) {
        setTitle("Sudoku");
        this.getContentPane().setPreferredSize(new Dimension(GAME_PANEL_WIDTH, GAME_PANEL_HEIGHT));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.add(gamePanel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
}