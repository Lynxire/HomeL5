import java.util.Random;

public class Task3 {
    public void snake(){
        int n = 4;
        int m = 6;


        int[][] snake = new int[n][m];

        int v = 1;
        for (int i = 0; i < snake.length; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < snake[i].length; j++) {
                    snake[i][j] = v;
                    v++;
                }
            }
            else {
                for (int j = snake[i].length - 1; j >= 0 ; j--) {
                    snake[i][j] = v;
                    v++;
                }
            }
        }

        for (int i = 0; i < snake.length; i++) {
            for (int j = 0; j < snake[i].length; j++) {
                if (snake[i][j] < 10){
                    System.out.print(snake[i][j] + "   ");
                }
                else if (snake[i][j] >= 10 && snake[i][j] < 100) {
                    System.out.print(snake[i][j] + "  ");
                }
                else {
                    System.out.print(snake[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}
