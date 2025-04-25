package decorator.src.main;

import decorator.src.models.Nota;
import decorator.src.models.NotaDePlata;
import decorator.src.models.NotaDePlataRevelion;

public class Main {
    public static void main(String[] args) {
        NotaDePlata notaDePlata = new NotaDePlata(500.5f);
        notaDePlata.printare();
        Nota notaDecorata = new NotaDePlataRevelion(notaDePlata);
        notaDecorata.printare();
    }
}