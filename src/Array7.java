import java.util.Random;


/*
 * Дан массив размера N. Вывести его элементы в обратном порядке
 */

public class Array7 {
    public static final int N = 10;
    public static void main(String[] args) {
        int[] mur = new int[N];
        Random random = new Random();
        for (int i = 0; i < mur.length; i++) {
            mur[i]= random.nextInt(6);
            System.out.print(mur[i]);
        }
        System.out.println();
        for (int i = N - 1; i >=0; i--) {
            System.out.print(mur[i] + " ");
        }
    }
}
