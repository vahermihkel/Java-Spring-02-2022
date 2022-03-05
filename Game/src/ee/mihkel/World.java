package ee.mihkel;

import java.util.List;

public class World {
    int height;
    int width;
    List<Item> items;

    public World(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void printMap(Player player, Enemy enemy, QuestMaster questMaster) {
        char symbol;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (y == 0 || y == height-1) {
                    symbol = '-';
                } else if (x == 0 || x == width-1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                for (Item i: items) {
                    if (x == i.xCoord && y == i.yCoord) {
                        symbol = 'I';
                    }
                }
                if (x == questMaster.xCoord && y == questMaster.yCoord) {
                    symbol = 'Q';
                }
                if (x == enemy.xCoord && y == enemy.yCoord && enemy.isVisible) {
                    symbol = 'Z';
                }
                if (x == player.xCoord && y == player.yCoord) {
                    symbol = 'X';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
