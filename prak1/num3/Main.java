package prak1.num3;

public class Main {
    public static void main(String args[]) {
        int[] array = {1, 2, 3};
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ = summ + array[i];
        }
        System.out.println(summ);
        System.out.println(summ/array.length);

    }
}