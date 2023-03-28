package Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StoreData {
    public static void main(String[] args) {
        try {
            Student student = new Student("Farzan", 0123);
            FileOutputStream fOutputStream = new FileOutputStream("myObject.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fOutputStream);
            outputStream.writeObject(student);
            outputStream.close();
            fOutputStream.close();   
        } catch (IOException e) {
           e.printStackTrace();
        }
       
    }
    
    
}
