import java.io.*;

public class FileAnalyzer {

    public static void main(String[] args) {
        String fileName = "output.txt";
        countFileStats(fileName);
    }

    public static void countFileStats(String fileName) {
        int charCount = 0, wordCount = 0, lineCount = 0;
        boolean isWord = false;

        try (FileReader fileReader = new FileReader(fileName);
             PushbackReader pushbackReader = new PushbackReader(fileReader)) {

            int ch;
            while ((ch = pushbackReader.read()) != -1) {
                charCount++;
                if (Character.isWhitespace(ch)) {
                    if (ch == '\n') {
                        lineCount++;
                    }
                    isWord = false;
                } else if (!isWord) {
                    wordCount++;
                    isWord = true;
                }
            }

            // Handle case where file doesn't end with a newline
            if (charCount > 0) {
                lineCount++;
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Jumlah Baris: " + lineCount);
        System.out.println("Jumlah Kata: " + wordCount);
        System.out.println("Jumlah Karakter: " + charCount);
    }
}
