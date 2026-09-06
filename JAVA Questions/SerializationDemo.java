import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
   int roll;
   String name;
   public Student(int roll, String name) {
       this.roll = roll;
       this.name = name;
   }
   public String toString() {
       return "Student [roll=" + roll + ", name=" + name + "]";
   }
}
public class SerializationDemo {
    public static void main(String[] args) {
        try {
            Student s = new Student(1324,"Ansh");
            FileOutputStream fout = new FileOutputStream("student.data");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeInt(1324);
            oos.writeInt(1325);
            oos.writeObject(s);
            oos.close();
            fout.close();
            FileInputStream fis = new FileInputStream("student.data");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int x = ois.readInt();
            int y = ois.readInt();
            Student studentFromFile = (Student) ois.readObject();
            System.out.println("Read integers: " + x + ", " + y);
            System.out.println("Deserialized Student: " + studentFromFile);
            ois.close();
            fis.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
