import java.util.Scanner;

public class automatinSwap {
    public static void swap(String[][] map, String[][] mapHelper, int rows, int columns) {
        Scanner word = new Scanner(System.in);
        GenerationZero.print(map);
        int newRows,newColumns,count=0;
        System.out.println("Choose a cell that you want to track");
        System.out.println("Rows");
        newRows=word.nextInt();
        System.out.println("Columns");
        newColumns=word.nextInt();
        System.out.println("How many rotation you want to make");
        int rotation = word.nextInt();
        int redCounter = 0, greenCounter = 0;
        for (int n=0;n<=rotation;n++) {
            if (map[newRows][newColumns].equals("1")) {
                count++;
            }
            for (int j = 0; j <= rows - 1; j++) {
                for (int i = 0; i <= columns - 1; i++) {
                    if (mapHelper[i][j].equals("0")) {
                        if (i > 0) {
                            if (mapHelper[i - 1][j].equals("1"))
                                redCounter++;
                            if (j < rows - 1) {
                                if (mapHelper[i - 1][j + 1].equals("1"))
                                    redCounter++;
                            }
                            if (j > 0) {
                                if (mapHelper[i - 1][j - 1].equals("1"))
                                    redCounter++;
                            }
                        }
                        if (i < columns - 1) {
                            if (j > 0) {
                                if (mapHelper[i + 1][j - 1].equals("1"))
                                    redCounter++;
                            }
                            if (j < rows - 1) {
                                if (mapHelper[i + 1][j + 1].equals("1"))
                                    redCounter++;
                            }
                            if (mapHelper[i + 1][j].equals("1"))
                                redCounter++;
                        }
                        if (j < rows - 1) {
                            if (mapHelper[i][j + 1].equals("1"))
                                redCounter++;
                        }
                        if (j > 0) {
                            if (mapHelper[i][j - 1].equals("1"))
                                redCounter++;
                        }
                        if (redCounter == 3 || redCounter == 6) {
                            map[i][j] = "1";
                        }
                        redCounter = 0;
                    } else {
                        if (i > 0) {
                            if (mapHelper[i - 1][j].equals("1"))
                                greenCounter++;
                            if (j < rows - 1) {
                                if (mapHelper[i - 1][j + 1].equals("1"))
                                    greenCounter++;
                            }
                            if (j > 0) {
                                if (mapHelper[i - 1][j - 1].equals("1"))
                                    greenCounter++;
                            }
                        }
                        if (i < columns - 1) {
                            if (j > 0) {
                                if (mapHelper[i + 1][j - 1].equals("1"))
                                    greenCounter++;
                            }
                            if (j < rows - 1) {
                                if (mapHelper[i + 1][j + 1].equals("1"))
                                    greenCounter++;
                            }
                            if (mapHelper[i + 1][j].equals("1"))
                                greenCounter++;
                        }
                        if (j < rows - 1) {
                            if (mapHelper[i][j + 1].equals("1"))
                                greenCounter++;
                        }
                        if (j > 0) {
                            if (mapHelper[i][j - 1].equals("1"))
                                greenCounter++;
                        }
                        if (greenCounter == 2 || greenCounter == 3 || greenCounter == 6) {
                        } else {
                            map[i][j] = "0";
                        }
                        greenCounter = 0;

                    }
                }
            }
            mapHelper=map;

        }
        System.out.println("The cell "+ newRows+"|"+newColumns+ " you chose was green "+ count +" times");
    }
}
