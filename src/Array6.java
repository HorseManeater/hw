
/*
* Даны целые числа N (> 2), A и B.
* Сформировать и вывести целочисленный массив размера N, первый элемент которого равен A,
* второйравен B, а каждый последующий элемент равен сумме всех предыдущих
 */

public class Array6 {
    public static final int N = 10;
    public static final int A = 5;
    public static final int B = 7;

    public static void main(String[] args) {
        int[] mur = new int[N];
        mur[0] = A;
        mur[1] = B;
        int sum = mur[0] + mur[1];
        mur[2] = sum;

        for (int i = 3; i < mur.length; i++) {
            mur[i]=mur[i-1] * 2;
            // System.out.print(mur[i] + " ");
        }
        for (int i = 0; i < mur.length; i++) {
            System.out.print(mur[i] + " ");
        }
    }
}
