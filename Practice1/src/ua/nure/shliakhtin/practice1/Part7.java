package ua.nure.shliakhtin.practice1;

public class Part7 {
    public static void main(String[] args) {
        System.out.println("A ==> " + str2int("A") + " ==> " + int2str(str2int("A")));
        System.out.println("B ==> " + str2int("B") + " ==> " + int2str(str2int("B")));
        System.out.println("Z ==> " + str2int("Z") + " ==> " + int2str(str2int("Z")));
        System.out.println("AA ==> " + str2int("AA") + " ==> " + int2str(str2int("AA")));
        System.out.println("AZ ==> " + str2int("AZ") + " ==> " + int2str(str2int("AZ")));
        System.out.println("BA ==> " + str2int("BA") + " ==> " + int2str(str2int("BA")));
        System.out.println("ZZ ==> " + str2int("ZZ") + " ==> " + int2str(str2int("ZZ")));
        System.out.println("AAA ==> " + str2int("AAA") + " ==> " + int2str(str2int("AAA")));

//        System.out.println(int2str(704));
    }

    private static int str2int(String number) {
        char[] mas = number.toCharArray();

        int res = 0;
        for (int i = 0; i < mas.length; i++)
            res += (mas[i] - 64) * (int)Math.pow(26, mas.length - i - 1);
        return res;
    }

    private static String int2str(int number) {
        StringBuilder res = new StringBuilder();
        for (int i = number; i != 0; i = (i - 1) / 26)
            res.append((char) ((i - 1) % 26 + 65));
        return res.reverse().toString();
    }

    private static String rightColumn(String number) {
        return int2str(str2int(number) + 1);
    }
}