import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileCopy {
    public static void main(String[] args) throws IOException {
        try (BufferedReader input = new BufferedReader(new FileReader("A.txt"));
            BufferedWriter output = new BufferedWriter(new FileWriter("A2.txt"))) {
            String line;
            int lineNumber = 1;
            while ((line = input.readLine()) != null) {
                if (lineNumber % 2 == 1) {
                    output.write(line);
                    output.newLine();
                }
                lineNumber++;
            }
        }
    }
}
