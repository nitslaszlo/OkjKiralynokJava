package eu.jedlik.OkjKiralynokJava;

import java.io.File;

public class Kiralynok // 0. feladat
{
    public Kiralynok() {
        System.out.println("4. feladat: Az üres tábla:");
        Tábla tábla = new Tábla('#');
        tábla.Megjelenít();

        System.out.println("\n6. feladat: A feltöltött tábla:");
        tábla.Elhelyez(8);
        tábla.Megjelenít();

        System.out.println("\n9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: " + tábla.ÜresOszlopokSzáma());
        System.out.println("Sorok: " + tábla.ÜresSorokSzáma());

        // 10. feladat
        final String fájlNeve = "tablak64.txt";
        File file = new File(fájlNeve);
        if (file.exists()) file.delete(); // 10.a
        System.out.println("10. feladat: " + fájlNeve);
        for (int i = 1; i < 65; i++) {
            Tábla aktTábla = new Tábla('*'); // 10.b
            aktTábla.Elhelyez(i); // 10.d
            aktTábla.FájlbaÍr(fájlNeve); // 10.c
        }
    }   
}