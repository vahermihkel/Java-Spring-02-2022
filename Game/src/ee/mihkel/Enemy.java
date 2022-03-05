package ee.mihkel;

public class Enemy extends Character {
    boolean isVisible;

    public Enemy(int worldWidth, int worldHeight) {
        super(worldWidth,worldHeight);
        this.isVisible = true;
    }
}
