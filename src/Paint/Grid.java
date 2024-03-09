package Paint;

import static Main.GamePanel.*;

import java.awt.*;
public class Grid {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g.setColor(Color.black);

        int cellWidth = GAME_PANEL_WIDTH / COLS;
        int cellHeight = GAME_PANEL_HEIGHT / ROWS;

        //Thin Grid Lines
        for (int i = 1 ; i < COLS; i++) {
            int x = i * cellWidth;
            g2d.drawLine(x, 0, x, GAME_PANEL_HEIGHT);
        }
        for (int i = 1; i < ROWS; i++) {
            int y = i * cellHeight;
            g2d.drawLine(0, y, GAME_PANEL_WIDTH, y);
        }

        //Thick Grid Lines
        g2d.setStroke(new BasicStroke(4));
        for (int i = 1; i < COLS / 3; i++) {
            int x = i * (GAME_PANEL_WIDTH / 3);
            g2d.drawLine(x, 0, x, GAME_PANEL_HEIGHT);
        }
        for (int i = 1; i < ROWS / 3; i++) {
            int y = i * (GAME_PANEL_HEIGHT / 3);
            g2d.drawLine(0, y, GAME_PANEL_WIDTH, y);
        }
    }
}
