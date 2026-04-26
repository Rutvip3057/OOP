import java.io.*;

public class FileStats {
    public static void main(String[] args) {
        int lines = 0;
        int words = 0;
        int characters = 0;

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                String trimmed = line.trim();
                if (!trimmed.isEmpty()) {
                    String[] wordList = trimmed.split("\\s+");
                    words += wordList.length;
                }

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        characters++;
                    }
                }
            }

            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters (excluding spaces & newlines): " + characters);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}