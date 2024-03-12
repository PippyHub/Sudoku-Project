package Paint;

import static Main.GamePanel.*;

import java.awt.*;
public class GridPaint {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g.setColor(Color.black);

        //Thin GridPaint Lines
        for (int i = 1 ; i < CELL_COLS; i++) {
            int x = i * CELL_WIDTH;
            g2d.drawLine(x, 0, x, GAME_PANEL_HEIGHT);
        }
        for (int i = 1; i < CELL_ROWS; i++) {
            int y = i * CELL_HEIGHT;
            g2d.drawLine(0, y, GAME_PANEL_WIDTH, y);
        }

        //Thick GridPaint Lines
        g2d.setStroke(new BasicStroke(4));
        for (int i = 1; i < CELL_COLS / 3; i++) {
            int x = i * (GAME_PANEL_WIDTH / (CELL_COLS / 3));
            g2d.drawLine(x, 0, x, GAME_PANEL_HEIGHT);
        }
        for (int i = 1; i < CELL_ROWS / 3; i++) {
            int y = i * (GAME_PANEL_HEIGHT / (CELL_ROWS / 3));
            g2d.drawLine(0, y, GAME_PANEL_WIDTH, y);
        }
    }
}
