abstract class Shape1 {
    int a;
    int b;
    int r;

    abstract void showArea();
}

class Rectangle extends Shape1 {

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void showArea(){
        System.out.println(a*b);
    }
}
class triangle extends Shape1 {
    public triangle (int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void showArea(){
        System.out.println(a*b/2);
    }
}

class circle extends Shape1 {
    public circle(int r){
        this.r =r;
    }
    @Override
    public void showArea(){
        System.out.println(r*r*3.14);
    }
}


public class Shape {
    public static void main(String[] args){
        Shape1 shape1 = new Rectangle(3,4);
        shape1.showArea();
    }
}
