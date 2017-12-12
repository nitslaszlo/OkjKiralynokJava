package eu.jedlik.OkjKiralynokJava;

public class Kiralynok // 0. feladat
{
    public Kiralynok() {
        System.out.println("4. feladat: Az üres tábla:");
        final Tábla tábla = new Tábla('#');
        tábla.Megjelenít();

        System.out.println("\n6. feladat: A feltöltött tábla:");
        tábla.Elhelyez(8);
        tábla.Megjelenít();

        System.out.println("\n9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: " + tábla.ÜresOszlopokSzáma());
        System.out.println("Sorok: " + tábla.ÜresSorokSzáma());

    }
}