package Task_1209;

import java.util.Scanner;
public class t1209 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long x = in.nextLong();

        for (int i = 0; i < x; i++) {
            long y = in.nextLong() - 1;

            long z = (long) Math.sqrt(8 * y + 1);

            if (z * z == (8 * y + 1)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}




