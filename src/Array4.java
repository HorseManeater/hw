
/*
* Дано целое число N (> 1),
* а так же первый член A и знаменатель Q геометрической прогрессии.
* Сформировать и вывести массив размера N,
* содержащий N первых членов данной прогрессии:
* A,    A·D,    A·D^2,    A·D^3,    ... .
 */

public class Array4 {
    public static final int N = 10;
    public static final int A = 2;
    public static final int R = 2;

    public static void main(String[] args) {
        int[] mur = new int[N];
        for (int i = 0; i < mur.length; i++) {
            mur[i] = A * ((int) Math.pow(R, i));
            System.out.print(mur[i] + " ");
        }
    }
}
