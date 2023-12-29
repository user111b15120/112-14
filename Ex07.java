import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Ex07 {

    public static void main(String[] args) {
        char[] hi = {'h', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};
        String welcome = "Welcome!";
        
        try{
            FileWriter fileWriter = new FileWriter("hello.txt");     
            fileWriter.write(hi);
            fileWriter.close();

            FileWriter appenWriter = new FileWriter("hello.txt", true);
            appenWriter.write(welcome + "\r\n");
            appenWriter.close();

            FileReader fileReader = new FileReader("hello.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.err.println(line);
            }

            bufferedReader.close();
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
