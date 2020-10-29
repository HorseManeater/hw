
/*
* Дано целое число N (> 1),
* а также первый член A и разность D арифметической прогрессии.
* Сформировать и вывести массив размера N,
* содержащий N первых членов данной прогрессии:
* A,    A + D,    A + 2·D,    A + 3·D,    ...
 */

public class Array3 {
    public static final int N = 10;
    public static final int A = 2;
    public static final int R = 2;

    public static void main(String[] args) {
        int[] mur = new int[N];
        for (int i = 0; i < mur.length; i++) {
            mur[i] = A + (i * R);
            System.out.print(mur[i] + " ");
        }
    }
}
