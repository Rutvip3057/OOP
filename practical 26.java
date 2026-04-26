import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCount {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide file name as command-line argument");
            return;
        }

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();

                String[] wordList = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += wordList.length;
                }
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}