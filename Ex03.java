import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {
    public static void main(String[] args) {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("Input an integer n: ");
            int n = Integer.parseInt(buf.readLine());
            int sum = 0;

            for (int i=1;i<=n;i++){
                sum += i;
            }
            System.out.println("sum of 1 to " + n + " = " + sum);
        } catch (IOException | NumberFormatException e){
            e.printStackTrace();
        }
    }
}
