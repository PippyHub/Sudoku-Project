package Level.CSV;

import static Main.GamePanel.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadCSV {
    public static int[][] readCSV(String filePath) {
        // Set all cells in the grid to 0
        int[][] readCSV = new int[CELL_ROWS][CELL_COLS];
        for (int ROW = 0; ROW < CELL_ROWS; ROW++) {
            for (int COL = 0; COL < CELL_COLS; COL++) {
                readCSV[ROW][COL] = 0;
            }
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int ROW = 0;
            int COL = 0;
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (c == ',') {
                        ROW++;
                        COL = 0;
                    } else {
                        if (ROW < CELL_ROWS && COL < CELL_COLS) {
                            readCSV[ROW][COL] = Character.getNumericValue(c);
                            COL++;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        return readCSV;

    }
}
