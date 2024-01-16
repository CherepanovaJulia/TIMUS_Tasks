package Task_1787;

import java.sql.SQLOutput;
import java.util.Scanner;

public class result2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int n = in.nextInt();
        int ost = 0;

        for (int i = 0; i < n; i++) {
            int nextCar = in.nextInt();
            ost = ost + nextCar - k;
            if (ost < 0) {
                ost = 0;
            }
        }
        System.out.println(ost);
        }
    }
