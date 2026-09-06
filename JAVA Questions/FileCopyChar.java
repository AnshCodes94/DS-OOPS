import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyChar {
    public static void main(String[] args){
       try {
            FileReader fr = new FileReader("Inheritance.java");
            FileWriter fw = new FileWriter("InheritanceCopy.java");
        try {
            int ch = 0;
            while (ch != -1) {
                ch = fr.read();
                if (ch == -1) {
                    break;
                }
                fw.write(ch);
            }
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            fr.close();
            fw.close();
            System.out.println("File copied successfully");
        }
    }
    catch (Exception e) {
        e.printStackTrace();
        }
    }
}
