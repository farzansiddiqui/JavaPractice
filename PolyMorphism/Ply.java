package PolyMorphism;
 
public class Ply extends Bank {

    public static void main(String[] args) {
     Bank bank;
     bank = new SBI();
     System.out.println("SBI of interest = "+bank.getRateOfInterest());
     bank = new ICICI();
     System.out.println("ICICI of Interest = "+bank.getRateOfInterest());
     bank = new HDFC();
     System.out.println("HDFC of Interest = "+bank.getRateOfInterest());
    
    }
   
        
    }
    
public class Bank {
    public float getRateOfInterest(){
        return 0;
    }

 }
 class SBI extends Bank {
    public float getRateOfInterest(){
        return 8.4f;
    }
 }
 class ICICI extends Bank {
    public float getRateOfInterest(){
        return 7.3f;
    }
 }
 class HDFC extends Bank {
    public float getRateOfInterest(){
        return 9.3f;
    }
 }

