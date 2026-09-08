// class Point1{
//     int x, y;
//     Point1(int x, int y){
//         this.x = x;
//         this.y = y;
//     }
// }

// class Box1 extends Object //! object class is the super class of all classes in java
// {
//     public void finalize(){
//         System.out.println("Box removed from memory");
//     }
// }

// class OpenBox1 extends Box1{

// }

// public class Stringsmethods {
//     public static void main(String[] args){
//         Point1 p1 = new Point1(5, 10);
//         System.out.println(p1);  //? will call p1.toString() method of object class

//         Box1 b1 = new Box1();
//         Box1 b2 = new OpenBox1();

//         String str = "Hello";
//         Object obj = "Hello";
//         printObjectdetails("Java");
//         someMethod();
//         System.gc();  //? request to JVM to run garbage collector
        

//     }
// }
