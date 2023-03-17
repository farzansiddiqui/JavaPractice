import java.util.Arrays;

public class JavaSorted {
    public static void main(String[] args) {
       int[] sortedNumber = {57, 7, 54, 55, 64,25, 6};
       // Buble sort using ascending order
       for (int i = 0; i < sortedNumber.length-1; i++) {
            for (int j = 0; j < sortedNumber.length-i -1; j++) {
                if (sortedNumber[j] > sortedNumber[j +1]) {
                    int temp = sortedNumber[j];
                    sortedNumber[j] = sortedNumber[j +1];
                    sortedNumber[j+1] = temp;
                }
            }

       }
       printArray(sortedNumber);

      
    }
    public static void printArray(int[] sortedNumber){
        for (int i = 0; i < sortedNumber.length; i++) {
            System.out.print(sortedNumber[i] + " ");
        }
        System.out.println();
    }
}