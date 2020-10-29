
/*
* Дано целоечисло N (>  0).
* Сформировать и вывести целочисленный массив размера N,
* содержащий N первых положительных нечетных чисел: 1, 3, 5, ...
*/

public class Array1 {
    public static final int N = 10;

    public static void main(String[] args) {
        int[] mur = new int[N];
        for (int i = 0; i < mur.length; i++) {
            mur[i] = 2 * i + 1;
            System.out.print(mur[i] + " ");
        }

    }
}
