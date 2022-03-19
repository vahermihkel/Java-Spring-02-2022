package ee.mihkel.klassid;

// komplekt väärtustest, mis võivad olla igal klassil erinevad
public class Tellimus {
    String tellija;
    int kogusumma;
    boolean makstud;

    // new Tellimus("Kaarel", 99, false); Tellimus@312fasd12
    // new Tellimus("Malle", 88, false); Tellimus@sada12312
    // new Tellimus("Karel",77, false); Tellimus@q123asdq

    // foreach -- if (makstud == false) {näita välja}

                    // luua saab uut tellimust ainult kui sulgude sisene on täidetud
                    // new Tellimus("",0,false);
    // constructor
    public Tellimus(String _tellija, int _kogusumma, boolean _makstud) {
        this.tellija = _tellija;
        this.kogusumma = _kogusumma;
        this.makstud = _makstud;
    }

    // constructor
    //public Tellimus() {
    // }

    // by Default on kõik klassid väljakuvades mälukohaga
    // ee.mihkel.klassid.Tellimus@71aa2f2

    // kui kuvame otse backendist brauserisse (ei kasuta frontendi)
    // siis tema väärtuste nägemiseks peame tegema toString() funktsiooni
    // kirjutab üle kuidas ta varasemalt näitas  (ee.mihkel.klassid.Tellimus@71aa2f2)
    // ja näidatakse nüüd niimoodi nagu on "return" taga kirjas (return "Tellimus{" + .....)
    @Override
    public String toString() {
        return "{" +
                "tellija:'" + tellija + '\'' +
                ", kogusumma:" + kogusumma +
                ", makstud:" + makstud +
                '}';
    }
}
