package ee.mihkel;

public class Item {
    int xCoord;
    int yCoord;
    double strength;
    ItemType itemType; // enum

    public Item(World world, ItemType itemType) {
        this.xCoord = (int) (Math.random()*(world.width-2)+1);;
        this.yCoord = (int) (Math.random()*(world.height-2)+1);
        this.itemType = itemType;
        if (itemType == ItemType.SWORD) {
            this.strength = 3;
        } else if (itemType == ItemType.HAMMER) {
            this.strength = 2;
        } else if (itemType == ItemType.DAGGER) {
            this.strength = 1;
        }
    }
}
