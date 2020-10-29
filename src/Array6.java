
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
        // у тебя действительно красивое решение,
        // но думаю более академичным будет заиметь переменную,
        // в которую будем суммировать всё,
        // что кладём в какой-либо из элементов массива
        int sum = mur[0] + mur[1];

        for (int i = 2; i < mur.length; i++) {
            mur[i] = sum;
            // можно было бы и делать sum+=sum;
            // но чисто с точки зрения смыслов здесь к тому, что уже было до этого,
            // суммируется значение нового элемента массива
            sum += mur[i];
            // System.out.print(mur[i] + " ");
        }
        for (int i = 0; i < mur.length; i++) {
            System.out.print(mur[i] + " ");
        }
    }
}
