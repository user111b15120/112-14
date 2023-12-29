import java.io.IOException;
import java.io.FileWriter;

public class Ex06 {

    public static void main(String[] args) {
        char[] hi = {'h', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};
        
        try{
            FileWriter fileWriter = new FileWriter("hello.txt");     
            fileWriter.write(hi);
            fileWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
