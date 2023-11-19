import java.util.Random;
import java.util.Scanner;

public class Task {
    public void one(){
        int[][] mn = new int[3][3];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < mn.length; i++) {
            for (int j = 0; j < mn[i].length; j++) {
                mn[i][j] = random.nextInt(10);
                System.out.print(mn[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Измененный массив с +n");
        for (int i = 0; i < mn.length; i++) {
            for (int j = 0; j < mn[i].length; j++) {
                mn[i][j] = mn[i][j] + n;
                sum = mn[i][j] + sum;

                System.out.print(mn[i][j] + " ");
             }
            System.out.println();
        }
        System.out.println("сумма всех чисел = " + sum);
    }
}
