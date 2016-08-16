package std.lava.general.patterns;

abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    
    // template method
    public final void play() {
        // initialize the game
        initialize();
        
        // start game
        startPlay();
        
        // end game
        endPlay();
    }
}

class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket::initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket:startPlay");
    }
    
    @Override
    void endPlay() {
        System.out.println("Cricket::endPlay");
    }
}

class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football::initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Football:startPlay");
    }
    
    @Override
    void endPlay() {
        System.out.println("Football::endPlay");
    }
}

public class TemplateMethodPattern1 {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
