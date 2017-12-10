package eu.jedlik.OkjKiralynokJava;

public class Kiralynok // 0. feladat
{
    public Kiralynok() {
        System.out.println("4. feladat: Az üres tábla:");
        Tábla tábla = new Tábla('#');
        tábla.Megjelenít();

        System.out.println("\n6. feladat: A feltöltött tábla:");
        tábla.Elhelyez(8);
        tábla.Megjelenít();
    }   
}