import java.util.*;

 class MapPattern {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
     
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String nameString = scanner.next();
            int mobileNumber = scanner.nextInt();
            map.put(nameString, mobileNumber);
           }
        System.out.println(map);
        while(scanner.hasNext()) {
            String s = scanner.next();
            if(map.containsKey(s)){
                System.out.println(s+"="+map.get(s));
              
            }else{
                System.out.println("Not found");
                break;
            }
        }

       scanner.close();
    }
}
