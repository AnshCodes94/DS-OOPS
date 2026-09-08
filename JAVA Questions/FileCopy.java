import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("Inheritance.java");
        FileOutputStream fout = new FileOutputStream("InheritanceCopy.java");

        int ch = 0;
        while (ch != -1){
            ch = fin.read();
            if (ch == -1){
                break;
            }
            fout.write(ch);
        }
        fin.close();
        fout.close();
        System.out.println("File copied successfully");
    }
}
