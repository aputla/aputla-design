package std.lava.general.patterns;

interface MyShape {
    void draw();
}

class MyRectangle implements MyShape {
    @Override
    public void draw() {
        System.out.println("MyRectangle()");
    }
}

class MySquare implements MyShape {
    @Override
    public void draw() {
        System.out.println("MySquare::draw()");
    }
}

class MyCircle implements MyShape {
    @Override
    public void draw() {
        System.out.println("MyCircle::draw()");
    }
}

class ShapeMaker {
    private MyShape circle;
    private MyShape rectangle;
    private MyShape square;
    
    public ShapeMaker() {
        circle = new MyCircle();
        rectangle = new MyRectangle();
        square = new MySquare();
     }

     public void drawCircle(){
        circle.draw();
     }
     
     public void drawRectangle(){
        rectangle.draw();
     }
     
     public void drawSquare(){
        square.draw();
     }
}

public class FacadePattern1 {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
