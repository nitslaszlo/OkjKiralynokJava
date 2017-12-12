package eu.jedlik.OkjKiralynokJava;

public class Tábla // 1. feladat
{
    private char[][] T; // 2. feladat
    private char ÜresCella; // 2. feladat

    public Tábla(char üresCella) { // 3. feladat
        T = new char[8][8]; // 3.a
        ÜresCella = üresCella; // 3.b
        for (int i = 0; i < 8; i++) // 3.c
        {
            for (int j = 0; j < 8; j++) {
                T[i][j] = ÜresCella; // 3.c
            }
        }
    }

    public void Megjelenít() // 4. feladat
    {
        for (int sor = 0; sor < 8; sor++) {
            for (int oszlop = 0; oszlop < 8; oszlop++) {
                System.out.print(T[sor][oszlop]);
            }
            System.out.println();
        }
    }

}