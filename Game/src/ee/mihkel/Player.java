package ee.mihkel;

// tellimused, kasutajad, tooted, kategooriad, postitused
// eesnimi, perenimi, e-mail, isikukood, aadress, salasõna
// muuda salasõna, muuda profiili andmeid, kustuta kasutaja

public class Player extends Character {
    Item fightWeapon;

    // constructor - kirjeldab kuidas seda klassi luuakse
    public Player(int worldWidth, int worldHeight) {
        super(worldWidth,worldHeight);
    }

    public void movePlayer(String input, int worldHeight, int worldWidth) {
        if (input.equals("w")) {
            if (yCoord > 1) {
                yCoord--;
            }
        } else if (input.equals("s")) {
            if (yCoord < worldHeight-2) {
                yCoord++;
            }
        } else if (input.equals("a")) {
            if (xCoord > 1) {
                xCoord--;
            }
        } else if (input.equals("d")) {
            if (xCoord < worldWidth-2) {
                xCoord++;
            }
        }
    }
}
