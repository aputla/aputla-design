interface DrawAPI {
    void drawCircle(int radius, int x, int y);
}

class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(String.format("Drawing Circle[color: red, radius: %d, x: %d, y: %d" + radius, x, y));
    }
}

class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(String.format("Drawing Circle[color: red, radius: %d, x: %d, y: %d" + radius, x, y));
    }
}

abstract class Shape {
    protected DrawAPI drawAPI;
    
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}

class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
       super(drawAPI);
       this.x = x;  
       this.y = y;  
       this.radius = radius;
    }

    public void draw() {
       drawAPI.drawCircle(radius,x,y);
    }
 }

public class BridgePattern1 {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
