import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("resources/test.txt"));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        System.out.println(lines);
        reader.close();
    }
}
