package Serializable;
import java.io.Serializable;

public class Student implements Serializable  {
     String name;
     int rollNumber;

    public Student(String name, int roolNumber){
            this.name = name;
            this.rollNumber = roolNumber;    
    }
    
}
