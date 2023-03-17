import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = 10;
        int j  = 0;
        for (int i = 0; i < n; i++) {
            arrayList.add(j);
            j++;
            
        }
    System.out.println(arrayList);
    int valueCheck = 5;
    if (arrayList.contains(valueCheck)) {
        System.out.println("value is exits = "+valueCheck);
    }else{
        System.out.println("value is not exits");
    }
    boolean isValueExists = false;
    for (int i = 0; i < arrayList.size(); i++) {
        if (valueCheck == arrayList.get(i)) {
                isValueExists = true;
                break;
        }
           
    }
    if (isValueExists) {
        System.out.println(valueCheck+" Value is exits");
        
    }else{
        System.out.println("value is not exits");
    }
    }
    
}
