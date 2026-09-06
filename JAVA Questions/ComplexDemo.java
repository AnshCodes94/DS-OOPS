//default constructer
// class Complex{
//     double real,img;
//     public void show(){
//         System.out.println(real + "+" + img + "i");
//     }
//     public void addReal(double r){
//         real=real+r;
//     }
//     public void setReal(double r){
//         real = r;
//     }
//     public void addImg(double i){
//         img = img+i;
//     }
//     public void setImg(double r){
//         img = r;
//     }
// }

// public class ComplexDemo {
//     public static void main(String[] args) {
//         Complex c1=new Complex();
//         c1.show();
//         c1.addReal(5.5);
//         c1.show();
//         c1.addReal(6.5);
//         c1.show();
//         c1.setReal(7);
//         c1.show();
//         c1.addImg(6);
//         c1.show();
//         c1.setImg(7);
//         c1.show();


//         Complex c2=new Complex();
//         c2.real=5;c2.img=4;
//         c2.setReal(5);
//         c2.addImg(4);
//         c2.show();
//         for(int i=1;i<=10;i++){

//         }
//     }
// }

// Parameterized contructer
class Complex{
    double real,img;
    public Complex(double r,double im){
        System.out.println("initializez the data of complex");
        real = r;
        img = im;
    }
    public Complex(double r){
        real = r;
    }
    public void show(){
        System.out.println(real+"+"+img+"i");
    }
    public void addReal(double r){
        real=real+r;
    }
    public void setReal(double r){
        real = r;
    }
    public void addImg(double i){
        img = img+i;
    }
    public void setImg(double r){
        img = r;
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1=new Complex(1,1);
        c1.show();
        c1.addReal(5.5);
        c1.show();
        c1.addReal(6.5);
        c1.show();
        c1.setReal(7);
        c1.show();
        c1.addImg(6);
        c1.show();
        c1.setImg(7);
        c1.show();


        Complex c2=new Complex(2,2);
        Complex c3=new Complex(8);

        c2.real=5;c2.img=4;
        c2.setReal(5);
        c2.addImg(4);
        c2.show();
        c3.addReal(19);
        c3.show();
       
    }
}