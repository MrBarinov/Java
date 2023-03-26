package HomeWork;
import java.io.IOException;

public class task1 {
    public static void main(String[] args) throws IOException {
        System.out.println(buildString(6, 'a', 'b'));
    }

    static String buildString(int n, char c1, char c2) {
        String str = new String();
        for (int i = 0; i < n; i++) {
            str += (i % 2 == 0) ? c1 : c2;
        }
        return str;

    }
}