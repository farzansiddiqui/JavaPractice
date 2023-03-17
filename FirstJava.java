import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstJava{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.next();
        System.out.println("Enter the number ");
        for (int i = 0; i < n; i++) {
            
            String personName = scanner.nextLine();
            int numberPerson = scanner.nextInt();
            map.put(personName, numberPerson);
            for (Map.Entry<String, Integer> mEntry : map.entrySet()) {
                System.out.println(mEntry.getKey()+" "+mEntry.getValue());
                scanner.close();
            }

        }


      
}
}