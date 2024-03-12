package Paint;

import Image.NumberImage;

import Level.CSV.ReadCSV;

import Main.GamePanel;

import static Main.GamePanel.*;

import java.awt.*;
public class NumberPaint {
    GamePanel gamePanel;
    private static final Image[] images;
    static {
        NumberImage numberImage = new NumberImage();
        images = numberImage.numberImage();
    }
    int[][] CSV = ReadCSV.readCSV("src/Level/CSV/Level1.csv");
    public NumberPaint(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g.setColor(Color.black);

        for (int ROW = 0; ROW < CELL_ROWS; ROW++) {
            for (int COL = 0; COL < CELL_COLS; COL++) {
                g.drawImage(images[CSV[ROW][COL]],COL * CELL_WIDTH,ROW * CELL_HEIGHT,this.gamePanel);
            }
        }
    }
}
