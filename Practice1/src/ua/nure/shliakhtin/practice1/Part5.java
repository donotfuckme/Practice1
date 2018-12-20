package ua.nure.shliakhtin.practice1;

public class Part5 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

        int res = 0;
        do {
            res += x % 10;
            x /= 10;
        } while (x > 0);

        System.out.println(res);
    }
}
