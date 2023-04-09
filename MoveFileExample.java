import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class MoveFileExample {
    public static void main(String[] args) {
        // Specify the path of the file to move
        Path sourceFile = Paths.get("D:\\New folder\\java\\next.png");

        // Specify the path of the target directory
        Path targetDirectory = Paths.get("D:\\New folder\\fileorganizer");

        try {
            // Move the file to the target directory
            Files.move(sourceFile, targetDirectory.resolve(sourceFile.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully!");
        } catch (IOException e) {
            System.out.println("Error moving file: " + e.getMessage());
        }
    }
}