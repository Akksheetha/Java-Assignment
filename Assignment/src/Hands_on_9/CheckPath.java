package Hands_on_9;
import java.nio.file.*;

public class CheckPath {

    public static void main(String[] args) {
        Path path = Paths.get("Text.txt");
        if (Files.exists(path)) {
            System.out.println("File or directory exists.");
        } else {
            System.out.println("File or directory does not exist.");
        }

    }
}
