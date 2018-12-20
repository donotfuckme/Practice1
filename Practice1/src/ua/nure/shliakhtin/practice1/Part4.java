package ua.nure.shliakhtin.practice1;

public class Part4 {
    public static void main(String[] args) {
        System.out.println(res(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }

    private static int res(int x, int y) {
        if (y == 0)
            return x;
        return res(y, x % y);
    }
}
