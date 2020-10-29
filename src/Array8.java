import java.util.Random;


/*
* Дан целочисленный массив размера N.
* Вывести все содержащиеся в данном массиве нечетные числа в порядке возрастания их индексов,
* а также их количество K.
*/

public class Array8 {
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
            if (mur[i] % 2 != 0) {
                k++;
                System.out.print(mur[i] + " ");
            }
        }
        System.out.println();
        System.out.println(k);
    }
}
