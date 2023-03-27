package ArrayQuestion;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        starPattern(5);
        starPatternOpposite(5);
        int[] arrayNumber = {100,15,50,6,7,8,10};
        for (int i = 0; i < arrayNumber.length-1; i++) {
                for (int j = i+1; j < arrayNumber.length; j++) {
                    if (arrayNumber[j] < arrayNumber[i]) {
                        System.out.println(arrayNumber[i]+" "+arrayNumber[j]);
                        int temp = arrayNumber[i];
                        arrayNumber[i] = arrayNumber[j];
                        arrayNumber[j] = temp;
                    }
                }
        }
            printArray(arrayNumber);
    }
    public static void printArray(int[] arrayNumber){
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print(arrayNumber[i]+" ");
        }
      
    }
    public static void starPattern(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = a; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }
    public static void starPatternOpposite(int number){
            for (int i = 1; i < number; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
    }

}
