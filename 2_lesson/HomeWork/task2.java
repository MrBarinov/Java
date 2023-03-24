package HomeWork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class task2 {
    public static void main(String[] args) throws IOException{
       
        Path of = Path.of("file.txt");
        System.out.println(Files.exists(of));

        Files.createFile(of);
    }
}
