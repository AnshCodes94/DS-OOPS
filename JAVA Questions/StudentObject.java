// code to make a student object with their info and then make a show function when we use it it will show the students data.

class Data{
    String name;
    int roll_no;
    int marks;

    public Data() {
    }

    public Data(String nm) {
        name = nm;
    }

    public Data(String nm , int rn) {
        name = nm;
        roll_no = rn;
    }

    public Data(String nm,int mk,boolean isMarksOnly) {
        marks = mk;
    }

    public Data(String nm, int rn, int mk) {
        name = nm;
        roll_no = rn;
        marks = mk;
    }

    public void show(){
        System.out.println("Student " + roll_no + ", " + name + " got " + marks + " marks");
    }

    public void setOnlyName(String n){
        name = n;
    }

    public void setRoll(String n,int roll){
        name = n;
        roll_no = roll;
    }

    public void setmarks(String n,int mark){
        name = n;
        marks = mark;
    }

    public void setAll(String n,int roll, int mark){
        name = n;
        roll_no = roll;
        marks = mark;
    }
}

public class StudentObject{
    public static void main(String[] args) {
        Data s1 = new Data("Aman");
        s1.show();

        Data s2 = new Data("Rohit", 101);
        s2.show();

        Data s3 = new Data("Vijay", 85,true);
        s3.show();

        Data s4 = new Data("Priya", 102, 92);
        s4.show();
    }
}