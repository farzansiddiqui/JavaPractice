import java.util.Scanner;

public class JavaBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] binaryArray = new int[1000];
        int i = 0;
        while (number != 0) {
            binaryArray[i] = number%2;
            number = number/2;
            i++;
        }
        for (int j = i-1; j >=0; j--) {
            System.out.print(""+binaryArray[j]);
        }
    }
}
