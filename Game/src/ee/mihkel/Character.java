package ee.mihkel;

public abstract class Character {
    int xCoord;
    int yCoord;

    public Character(int worldWidth, int worldHeight) {
        this.xCoord = (int) (Math.random()*(worldWidth-2)+1);
        this.yCoord = (int) (Math.random()*(worldHeight-2)+1);
    }

    public void randomizeCoordinates(int worldWidth, int worldHeight) {
        this.xCoord = (int) (Math.random()*(worldWidth-2)+1);
        this.yCoord = (int) (Math.random()*(worldHeight-2)+1);
    }
}
