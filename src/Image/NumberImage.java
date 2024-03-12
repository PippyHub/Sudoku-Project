package Image;

import java.awt.*;
import java.awt.image.BufferedImage;

import static Main.GamePanel.*;

public class NumberImage {
    public Image[] numberImage() {
        Image[] numberImages = new Image[10];
        for (int i = 0; i < 10; i++) {
            BufferedImage numberImage = new BufferedImage
                    (CELL_WIDTH, CELL_HEIGHT, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = numberImage.createGraphics();
            g.setColor(Color.black);
            int fontSize = (int) (CELL_WIDTH / 1.5);
            g.setFont(new Font("Arial", Font.PLAIN, fontSize));

            String numberText = String.valueOf(i);
            FontMetrics fontMetrics = g.getFontMetrics();
            int xCenter = (CELL_WIDTH - fontMetrics.stringWidth(numberText)) / 2;
            int yCenter = (CELL_HEIGHT - fontMetrics.getHeight()) / 2 + fontMetrics.getAscent();

            g.drawString(numberText, xCenter, yCenter);
            g.dispose();
            numberImages[i] = numberImage;
        }
        return numberImages;
    }
}
