public class Uczen  extends Osoba{
    //dziedziczenia
    //klasa Uczen jest klasa pomomna dla klasy bazowej Osoba
    private int nrUcznia;
    private static int liczbaUczniow;

    public Uczen(String imie, int wiek, int nrUcznia) {
        super(imie, wiek);//wywoluje konstruktor klasy bazowej Osoba
        this.nrUcznia = nrUcznia;
        liczbaUczniow++;
    }

    public Uczen() {
        liczbaUczniow++;
        nrUcznia = liczbaUczniow;
    }

    public Uczen(String imie, int wiek) {
        super(imie, wiek);
        liczbaUczniow++;
        nrUcznia =liczbaUczniow;
    }

    public int getNrUcznia() {
        return nrUcznia;
    }

    public static int getLiczbaUczniow() {
        return liczbaUczniow;
    }

    @Override
    public String toString() {
        return "Uczen " +
                "nrUcznia=" + nrUcznia +
                ", imie='" + imie + '\'' +
                ", wiek= "+getWiek();
    }
}
