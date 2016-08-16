package std.lava.general.patterns;

interface OldInterface {
    void oldWay();
}

interface TargetInterface {
    void newWay();
}

class Adaptee implements OldInterface {
    @Override
    public void oldWay() {
    }
}

class Adapter implements TargetInterface {
    
    private final Adaptee adaptee;
    
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    
    @Override
    public void newWay() {
        adaptee.oldWay();
    }
}

public class AdapterPattern1 {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        adapter.newWay();
    }
}
