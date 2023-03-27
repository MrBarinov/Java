
// Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<Integer> kit = new ArrayList<>(Arrays.asList(1, 1, 2, 4, 1, 6, 3, 5, 6, 11, 22));
        System.out.println(kit);
        even(kit);
        System.out.println(kit);
    }

    private static void even(List<Integer> kit) {
        int i = 0;
        while (i < kit.size()) {
            if (kit.get(i) % 2 != 0) {
                kit.remove(i);
            } else {
                i++;
            }
        }
    }
}
