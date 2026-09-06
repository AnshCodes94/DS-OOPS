import java.io.File;
import java.util.Arrays;

public class FileInfo {
    public static void main(String[] args) {
        File dir = new File(".");
        System.out.println(dir.getAbsolutePath());
        System.out.println(dir.isDirectory());
        System.out.println(dir.isFile());
        String[] list = dir.list();
        System.out.println(Arrays.toString(list));

        File file = new File("Patterns.java");
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println();
    }
}
