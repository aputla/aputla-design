
interface CustomShape {
    void draw();
}

class CustomRectangle implements CustomShape {
    @Override
    public void draw() {
        System.out.println("CustomRectangle::draw");
    }
}

class CustomSquare implements CustomShape { 
    @Override
    public void draw() {
        System.out.println("CustomSquare::draw");
    }
}

class CustomCircle implements CustomShape {
    @Override
    public void draw() {
        System.out.println("CustomCirlcle::draw");
    }
}

class CustomShapeFactory {
    public CustomShape getShape(String shapeType) {
        switch (shapeType) {
        case "CIRCLE":
            return new CustomCircle();
        case "RECTANGLE":
            return new CustomRectangle();
        case "SQUARE":
            return new CustomSquare();
        }
        return null;
    }
}

public class AbstractFactoryPattern1 {
    public static void main(String[] args) {
        CustomShapeFactory shapeFactory = new CustomShapeFactory();

        CustomShape shape1 = shapeFactory.getShape("CIRCLE");
        CustomShape shape2 = shapeFactory.getShape("RECTANGLE");
        CustomShape shape3 = shapeFactory.getShape("SQUARE");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
