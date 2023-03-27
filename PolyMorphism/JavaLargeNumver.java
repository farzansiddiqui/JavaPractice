package PolyMorphism;

public class JavaLargeNumver {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,5 , 89 , 580};
        int largeNUmber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largeNUmber) {
                largeNUmber = arr[i];
            }
        }
        System.out.println(largeNUmber);
              
    }
}
