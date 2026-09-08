class Point {
    int x, y;             // * instance variables for a point's coordinates
    static int orgx, orgy; // * static variables shared by all Point objects

    static {
        // * initialize static origin coordinates once when the class is loaded
        orgx = 10;
        orgy = 10;
    }

    public static void printOrigin() {
        //! static method can access static fields directly
        System.out.println("Origin: " + orgx + ", " + orgy);
    }

    public static int getorgx(){
        return orgx;
    }
    public void show(){
        System.out.println(x+","+y);
        System.out.println(orgx+","+orgy);
    }
}

public class Staticdemo {
    public static void main(String[] args) {
        //? create two Point objects with instance coordinates
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 2;
        Point.orgx=10;
        Point.orgy=10;

        Point p2 = new Point();
        p2.x = 11;
        p2.y = 12;
        Point.orgx=10;
        Point.orgy=20;

        // * print instance-specific values
        System.out.println("Point p1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("Point p2: (" + p2.x + ", " + p2.y + ")");

        // * print the shared static origin coordinates
        Point.printOrigin();
        p1.show();
        p2.show();
    }
}
