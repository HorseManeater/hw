
/*
* Дано целое число N (>  0).
* Сформировать и вывести целочисленный массив размера N,
* содержащий степени двойки от первой до N-й:  2,  4,  8,  16, ... .
*/

public class Array2 {
    public static final int N = 10;

    public static void main(String[] args) {
        int[] mur = new int[N];
        for (int i = 1; i < mur.length; i++) {
            mur[i] = (int)Math.pow(2,i);
            System.out.print(mur[i] + " ");
        }
    }
}
