import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class BufferReader { 
   
    public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("please enter a and b ");
       int n = Integer.parseInt(bufferedReader.readLine());
       int b = Integer.parseInt(bufferedReader.readLine());
       
       int c = n + b;
       System.out.println("Result = "+c);


    }
}
