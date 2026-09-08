class Box {
    protected double ln, wg, ht;

    public Box(double ln, double wg, double ht) {
        this.ln = ln;
        this.wg = wg;
        this.ht = ht;
    }

    public double volume() {
        return ln * wg * ht;
    }
    public void show(){
        System.out.println("Box : " + ln +" "+ wg +" "+ ht );
    }

    public double surfaceArea(){
        return 2*(ln*wg+wg*ht+ht*ln);
    }
}

class openBox extends Box {
    public openBox(double ln, double wg, double ht) {
        super(ln, wg, ht);
    }
     public void show(){
        System.out.println("openBox : " + ln +" "+ wg +" "+ ht );
    }
    public double surfaceArea() {
        return ln * wg + 2 * (wg * ht + ht * ln);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Box b = new Box(5, 5, 5);
        openBox op = new openBox(5, 5, 5);
        b.show();
        op.show();
        System.out.println("Volume: " + op.volume());
        System.out.println("Surface area (box): "+ b.surfaceArea());
        System.out.println("Surface area (openBox): " + op.surfaceArea());
    }
}
