import java.util.Random;


/*
* Дан целочисленный массив размера N.
* Вывести вначале все содержащиеся в данном массиве четные числа в порядке возрастания их индексов,
* а затем — все нечетные числа в порядке убывания их индексов
*/

public class Array10 {
    public static final int N = 10;

    public static void main(String[] args) {
        int[] mur = new int[N];
        Random random = new Random();
        for (int i = 0; i < mur.length; i++) {
            mur[i] = random.nextInt(8);
            System.out.print(mur[i]);
        }
        System.out.println();
        int k = 0;
        for (int i = 0; i < mur.length; i++) {
            if (mur[i] % 2 == 0) {
                k++;
                System.out.print(mur[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Количество четных = " + k);

        k = 0;
        for (int i = N -1; i >= 0; i--) {
            if (mur[i] % 2 != 0) {
                k++;
                System.out.print(mur[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Количество нечетных = " + k);

    }
}
