/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Lecturer
 */
public class Serialisation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        
        System.out.println((int) 3.5);
        
        Rectangle rect1 = new Rectangle(2, 5, "yellow");
        Rectangle rect2 = new Rectangle(5, 7, "blue");
        Rectangle rect3 = new Rectangle(2, 5, "yellow");
        
        System.out.println(rect1.equals(rect1));
        System.out.println(rect1.equals(rect2));
        System.out.println(rect1.equals(rect3));
        
        Object obj1 = (Object) rect1;
        
        rect1.getArea();
//        obj1.getArea();
        
        FileOutputStream file = new FileOutputStream("rect1.txt");
        ObjectOutputStream out = new ObjectOutputStream(file);
        
        out.flush();
        out.writeObject(rect1);
        out.close();
        
        FileInputStream fileInput = new FileInputStream("rect1.txt");
        ObjectInputStream in = new ObjectInputStream(fileInput);        
        
        System.out.println(in.available());
        System.out.println(rect1 instanceof Rectangle);
//        Object rect4 =  in.readObject();
//        Rectangle rect4 =  in.readObject();
//        System.out.println(in.readObject() instanceof Rectangle);
        Rectangle rect4 = (Rectangle) in.readObject();
        System.out.println(in.available());
        System.out.println(rect1.equals(rect4));
        System.out.println(rect1);
        System.out.println(rect4);
        
        FileOutputStream file2 = new FileOutputStream("rectangles");
        ObjectOutputStream out2 = new ObjectOutputStream(file2);
        
        out2.flush();
        out2.writeObject(rect1);
        out2.writeObject(rect2);
        out2.writeObject(rect3);
        out2.close();       
        
        FileInputStream fileInput2 = new FileInputStream("rectangles");
        ObjectInputStream in2 = new ObjectInputStream(fileInput2);
        Rectangle rect5 = (Rectangle) in2.readObject();
        Rectangle rect6 = (Rectangle) in2.readObject();
        Rectangle rect7 = (Rectangle) in2.readObject();
        System.out.println(rect5.getArea());
        System.out.println(rect6.getArea());
        System.out.println(rect7.getArea());
        
    }
    
}
