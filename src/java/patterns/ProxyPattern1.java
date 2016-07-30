
interface Image {
    void display();
}

class RealImage implements Image {
    private String fileName;
    
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("RealImage::display");
    }
    
    private void loadFromDisk(String fileName) {
        System.out.println("RealImage::loadFromDisk");
    }
}

class ProxyImage implements Image {
    
    private RealImage realImage = null;
    private String fileName;
    
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

public class ProxyPattern1 {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
        image.display();
    }
}
