package Task_2100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Маршалл и Лили женятся! Они отослали всем друзьям приглашения на свадьбу.
// На каждом приглашении можно отметить +one — это значит, что друг хочет прийти со своей парой (не из числа приглашённых).
// Все друзья ответили на приглашения, и теперь Лили хочет узнать, на сколько гостей организовывать обед в ресторане.
// Все гости будут сидеть за одним большим столом.
// Маршалл очень суеверный, поэтому если за столом окажутся ровно 13 человек (включая Маршалла и Лили),
// то Лили попросит сотрудников ресторана посадить манекен и обслуживать его наравне со всеми.
// Сколько же потратит молодая пара на этот обед, если обслуживание одного человека (или манекена) стоит $100?
//Исходные данные
//В первой строке вводится одно целое число n — количество друзей Маршалла и Лили, которым они отослали приглашение (1 ≤ n ≤ 20).
//Затем в n строках описываются ответы на приглашения.
// Каждый ответ имеет вид name[+one]. Это имя приглашённого друга и +one, если друг отметил этот вариант.
// Гарантируется, что длина каждого имени не превосходит 20, и каждое имя состоит только из букв латинского алфавита.
//Результат
//Выведите одно целое число — стоимость обеда в долларах.
//



public class result {
    public static void main(String[] args) {

        String inputFileName = "src/Task_2100/input.txt";

        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int MarshAndLyl = 2 ;

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));

            String readLine = "";
            int numberOfFriends = 0;
            int numberOfCouples = 0;

            while ((readLine = bufferedReader.readLine()) != null) {
                if (numberOfFriends == 0) {
                    numberOfFriends = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")) {
                    numberOfCouples++;
                }
            }
            int result;
            int guests = (MarshAndLyl + numberOfFriends + numberOfCouples);

            if (guests == 13){
                result = (guests * 100 ) + 100;
            }
            else{
                result = guests * 100;
            }



                System.out.println(result);

        } catch(IOException exception)
        {exception.printStackTrace();}
    }
}
