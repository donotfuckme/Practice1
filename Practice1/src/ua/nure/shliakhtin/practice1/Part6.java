package ua.nure.shliakhtin.practice1;

public class Part6 {

    public static void main(String[] args) {
        int[] mas = new int[Integer.parseInt(args[0])];

        int justNum = 2;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = test(justNum);
            justNum = mas[i] + 1;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    private static int test(int num) {
        while (!isAJustNumber(num))
            num++;
        return num;
    }

    private static boolean isAJustNumber(int num) {
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;
        return true;
    }
}
