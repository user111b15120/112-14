import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex09 {
    public static void main(String[] args) {

        String aaaContent = readFile("aaa.txt");
        String bbbContent = readFile("bbb.txt");

        String cccContent = aaaContent + bbbContent;    
        writeFile("ccc.txt", cccContent);

        System.out.println("aaa.txt Content:");
        System.out.println(aaaContent);

        System.out.println("bbb.txt Content:");
        System.out.println(bbbContent);

        System.out.println("ccc.txt Content:");
        System.out.println(cccContent);
    }
    
    private static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine()) != null){
                content.append(line).append("\n");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return content.toString();
    }

    private static void writeFile(String fileName, String content){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            writer.write(content);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
