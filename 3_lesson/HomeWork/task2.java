import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Дан список ArrayList<String>. Удалить из него все строки, которые являются числами 
// Пример: ArrayList<String> list = new ArrayList<>
// (List.of("string", "s", "5", "10", "-12", "my_value")); ["string", "s", "my_value"]

public class task2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> kit = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(kit);
        stringNumber(kit);
        System.out.println(kit);
    }

    private static void stringNumber(ArrayList<String> kit) throws IOException {
        int i = 0;
        while (i < kit.size()) {
            try {
                Integer.parseInt(kit.get(i));
                kit.remove(i);
                i--;
            } catch (Exception e) {
            }
            i++;
        }
    }
}