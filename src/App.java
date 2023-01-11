import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> string1 = new ArrayList<>(Arrays.asList("Uva","Melancia","Caju","Morango","Banana"));
     
        List<String> string2 = new ArrayList<>();
        string2.add("Maçã");
        string2.add("Pêra");
        string2.add("Banana");
        string2.add("Melancia");
        string2.add("Morango");

        for (int i = 0; i < string1.size(); i++) {

            String word = string1.get(i);

            if (string2.contains(word)) {
                System.out.println(word);

            }
        }

    }

}
