package Task_1880;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws Exception {

        String inputFileName = "src/Task_1880/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                     new BufferedReader(new FileReader(inputFileName));

        int size1 = Integer.parseInt(bufferedReader.readLine());
        String[] strings1 = bufferedReader.readLine().split(" ");

        int size2 = Integer.parseInt(bufferedReader.readLine());
        String[] strings2 = bufferedReader.readLine().split(" ");

        int size3 = Integer.parseInt(bufferedReader.readLine());
        String[] strings3 = bufferedReader.readLine().split(" ");

        int allSize = size1 + size2 + size3;
        String[] result = new String[allSize];


        for (int i = 0, x = 0, y = 0; i < allSize; i++){
            if (i < size1){
                result[i] = strings1[i];
                continue;
            }
            if (i < (size1 + size2)){
                result[i] = strings2[x];
                x++;
                continue;
            }
            result[i] = strings3[y];
            y++;
        }

        Arrays.sort(result);

        int count = 0;
        for (int i = 1; i < result.length - 1; i++){
            if (result[i - 1].equals(result[i]) && result[i].equals(result[i+1])){
                count++;
            }
        }
        System.out.println(count);
    }
}

