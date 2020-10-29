
/*
* Дано целое число N (>  2).
* Сформировать и вывести целочисленный массив размера N,
* содержащий N первых элементов последовательности чисел Фибоначчи F(K):
* F(1) = 1,        F(2) = 1,        F(K) = F(K–2) + F(K–1),    K = 3, 4, ... .
*/

public class Array5 {
    public static final int N = 10;

    public static void main(String[] args) {
        int[] mur = new int[N];
        mur[0] = 1;
        mur[1] = 1;
        for (int i = 2; i < mur.length; i++) {
            mur[i] = mur[i - 2] + mur[i - 1];
            //System.out.print(mur[i] + " ");
        }
        for (int i = 0; i < mur.length; i++) {
            System.out.print(mur[i] + " ");
        }
    }
}
