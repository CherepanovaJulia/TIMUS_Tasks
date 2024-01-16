package Task_1293;

import java.io.PrintWriter;
import java.util.Scanner;

public class result {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int result = (n * (a * b )) * 2;
        out.println("Ответ = " + result);
        out.flush();
    }
}
