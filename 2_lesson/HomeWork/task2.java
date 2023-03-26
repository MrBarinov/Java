package HomeWork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class task2 {
    public static void main(String[] args) throws IOException {

        Path dir = Path.of("file.txt");
        String text = "TEXT\n";

        for (int i = 0; i < 100; i++) {
            Files.writeString(dir, text, StandardOpenOption.APPEND);
        }
    }
}
