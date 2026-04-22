public class Main {
    public static void main(String[] args) {

        ProduktMenu p1 = new ProduktMenu("K-01", "Kawa", 10.0, "napój");
        ProduktMenu p2 = new ProduktMenu("D-01", "Tiramisu", 18.0, "deser");
        ProduktMenu p3 = new ProduktMenu("D-02", "Ciasteczko", 8.0, "deser");

        KlientKawiarni klient = new KlientKawiarni(1, "Tony", "Stark", "tony@starkindustries.com");

        Zamowienie zamowienie = new Zamowienie(klient);
        zamowienie.dodajProdukt(p1);
        zamowienie.dodajProdukt(p2);
        zamowienie.dodajProdukt(p3);

        System.out.println(klient);
        System.out.println(zamowienie);
        System.out.println("Łączna wartość: " + zamowienie.policzWartosc());
        System.out.println("Liczba pozycji: " + zamowienie.policzLiczbeProduktow());
        System.out.println("Liczba produktów: " + ProduktMenu.getLiczbaProduktow());

        ProduktMenu kopia = new ProduktMenu("K-01", "Kawa Premium", 10.0, "napój");
        System.out.println("Czy produkty są równe? " + p1.equals(kopia));

        zamowienie.oznaczJakoOplacone();
        System.out.println(zamowienie);
    }
}