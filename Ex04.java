import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Ex04 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("donkey.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int charCount = 0;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                charCount += line.length(); 
            }

            bufferedReader.close();

            System.out.println("Total characters read: " + charCount);      // (b)

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
