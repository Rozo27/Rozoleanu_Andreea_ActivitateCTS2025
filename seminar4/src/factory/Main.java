package factory;

import factory.bucatarie.Bucatarie;
import factory.bucatarie.TipSupa;
import factory.products.Supa;

public class Main {

    public static void main(String[] args) {
        Bucatarie bucatarie = new Bucatarie(250, 25.5F);
        Supa supaVita = bucatarie.getSupa(TipSupa.VITA, 0, true, true);
        Supa supaLegume = bucatarie.getSupa(TipSupa.LEGUME, 0, true, true);
        Supa supaCiuperci = bucatarie.getSupa(TipSupa.CIUPERCI, 0, true, true);


        supaVita.afiseazaDescriere();
        supaLegume.afiseazaDescriere();
        supaCiuperci.afiseazaDescriere();

        Bucatarie cantina = new Bucatarie(500, 10.5F);

    }
}