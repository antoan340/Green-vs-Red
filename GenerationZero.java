import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GenerationZero {
        public static void mapCreate(){
            Scanner word = new Scanner(System.in);

            int rows, columns,rand;
            System.out.println("Enter a value for the rows");
            rows=word.nextInt();
            System.out.println("Enter a value for the columns");
            columns=word.nextInt();
            if(rows<1000&&columns<1000) {
                String[][] map = new String[rows][columns];
                String[][] mapHelper = new String[rows][columns];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        rand = ThreadLocalRandom.current().nextInt(0, 2);
                        if (rand == 0) {
                            map[i][j] = "0";
                            mapHelper[i][j] = "0";
                        } else {
                            map[i][j] = "1";
                            mapHelper[i][j] = "1";
                        }
                    }
                }
                automatinSwap.swap(map,mapHelper,rows,columns);
            }else {
                System.out.println("You entered a wrong value");
                mapCreate();
            }



        }
        public static void print(String[][] map){
            for (String[] row : map) {
                for (String c : row) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }


}
