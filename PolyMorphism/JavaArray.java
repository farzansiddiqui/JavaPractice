package PolyMorphism;

public class JavaArray {
   
    public static void main(String[] args){
        int[] arr = new int[10];
        arr = new int[]{2,2,2,4,4,7,7,7,8,0};
    
        int countNumber = 0;
    
    for(int i = 0; i < arr.length-1; i++){
        for(int j = i+1; j < arr.length; j++){
    
        if(arr[i] == arr[j]){
            countNumber++;
            break;
    }
    }
       
    }

   
        System.out.println("Duplicate  "+countNumber);
        

}
}
