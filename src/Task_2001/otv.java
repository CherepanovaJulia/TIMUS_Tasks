package Task_2001;

import java.io.PrintWriter;
import java.util.Scanner;

public class otv {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        int berry2 = b1 - b2;
        int berry1 = b3 - berry2 - b2;

        System.out.println( berry1 + " " + berry2 );


    }
}
