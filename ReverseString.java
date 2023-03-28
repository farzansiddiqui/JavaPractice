public class ReverseString {
    public static void main(String[] args) {
        String  s = "Hello";
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            reverse = s.charAt(i) + reverse;
            
        }
        System.out.println(reverse);
        reverseInteger(12345);

    }
    public static void reverseInteger(int number){
            int reverse = 0;
            while (number!= 0) {
                int remainder = number % 10; //4,3,2,1
                reverse = reverse * 10 + remainder; // 4321
                number = number / 10; //123,12,1
            }
            System.out.println(reverse);
    }
    
    
}
