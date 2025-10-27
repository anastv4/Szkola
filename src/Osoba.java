public  abstract class Osoba {
    //abstract z klasy tej nie mozna tworzyc obiektow
    public String imie;
    private int wiek; //hermatyzacja czyli ograniczony dostep do pol metod
    //private tyl;ko w tej klasie
    // public dostepny wszedzie
    //protecetd sostepne w tej klasie i klasie potomnej (w Javie takze w ramach pakietu)
    // brak modyfikatora dostepu - dostepne w pakiecie

    // przeciazamie
    public Osoba( ) {
        imie = "";
        wiek = 0;
    }

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    //do wieku metody dostepowe


    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek>0 && wiek<100) {
            this.wiek = wiek;
        }
        else {
            this.wiek = 0;
        }
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
