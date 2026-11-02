import java.util.*;

class Student {
    int roll;
    String name;
    int[] marks = new int[5];

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    Student(int roll, String name, int[] marks) {
        this.roll = roll;
        this.name = name;
        this.marks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }

    public Student(Student s) {
        this.roll = s.roll;
        this.name = s.name;
        this.marks = new int[s.marks.length];
        for (int i = 0; i < s.marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }

    public String toString() {
        return "Student{" + "roll = " + roll + ", name = " + name + ", marks = " + Arrays.toString(marks) + '}';
    }

    }

public class CopyConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("Enter marks:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        Student s1 = new Student(24, "Ansh", marks);
        System.out.println(s1.toString());

        Student s2 = new Student(92,"Akhilesh",marks);
        System.out.println(s2.toString());

        Student s3 = new Student(81, "Kanav", new int[]{70, 80, 90, 68, 79});
        System.out.println(s3.toString());

        sc.close();
    }
}