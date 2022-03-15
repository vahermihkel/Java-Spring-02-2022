package ee.mihkel.klassid;

public class Tellimus {
    String tellija;
    int kogusumma;
    boolean makstud;

                    // luua saab uut tellimust ainult kui sulgude sisene on täidetud
                    // new Tellimus("",0,false);
    public Tellimus(String _tellija, int _kogusumma, boolean _makstud) {
        this.tellija = _tellija;
        this.kogusumma = _kogusumma;
        this.makstud = _makstud;
    }

    // constructor
    //public Tellimus() {
    // }


    @Override
    public String toString() {
        return "Tellimus{" +
                "tellija='" + tellija + '\'' +
                ", kogusumma=" + kogusumma +
                ", makstud=" + makstud +
                '}';
    }
}
