import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] number = {1, 5 , 5, 7, 8 , 7, 45 , 78, 78,55,7};
        findDuplicateNumber(number);
        
    }
    public static void findDuplicateNumber(int[] number){
            ArrayList<Integer> arrayList = new ArrayList<>();
            ArrayList<Integer> tempArrayList = new ArrayList<>();

            for (int i : number) {
                if (!tempArrayList.contains(i)) {
                    tempArrayList.add(i);
                }else if (!arrayList.contains(i)) {
                    arrayList.add(i);
                }
            }
            System.out.println(Arrays.toString(number));
           
           // System.out.println(arrayList.toString());
            printArray(arrayList);
    }
    public static void printArray(ArrayList<Integer> display){
           for (Integer integer : display) {
                    System.out.print(integer);
                   
           }
           System.out.println();
    }
}
