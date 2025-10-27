public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Osoba osoba1 = new Osoba();
        System.out.println(osoba1.imie);
        osoba1.imie = "Jaś";
        System.out.println(osoba1.imie);
        osoba1.setWiek(123);
        System.out.println(osoba1.getWiek());
        osoba1.setWiek(23);
        System.out.println(osoba1.getWiek());
        System.out.println(osoba1);
        Osoba osoba2 = new Osoba("Asia",31);
        System.out.println(osoba2);
        System.out.println("Liczba uczniow " + Uczen.getLiczbaUczniow());
        Uczen uczen = new Uczen("Edmund",13,1234);
        System.out.println(uczen);
        Uczen uczen1 = new Uczen();
        System.out.println(uczen1);
        System.out.println("Liczba uczniow " + Uczen.getLiczbaUczniow());

    }
}