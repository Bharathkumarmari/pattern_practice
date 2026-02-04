import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStatsCounter {
    public static void main(String[] args) {
        // Replace with the path to your file
        String fileName = "sample.txt";

        int wordCount = 0;
        int lineCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++; // Count the line

                charCount += line.length(); // Count characters (excluding newline)

                // Split the line into words based on whitespace
                String[] words = line.trim().split("\\s+");

                // Check for empty line
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters (excluding newlines): " + charCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
