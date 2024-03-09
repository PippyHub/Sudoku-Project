package Paint;

import static Main.GamePanel.*;

import java.awt.*;
public class Background {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.gray);

        g2d.fillRect(0,0,GAME_PANEL_WIDTH,GAME_PANEL_HEIGHT);
    }
}
