package Task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class result {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        PrintWriter out = new PrintWriter(System.out);

        int Ex = in.nextInt();
        int differ = 12 - Ex;
        int time = differ * 45;

        String result = time <=240 ? "YES" : "NO";

       //if (time <= 240) {
       //     System.out.println("YES");
       // } else {
       //     System.out.println("NO");
       //  }

        out.println(result);
        out.flush();
    }
}
