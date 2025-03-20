package factory.bucatarie;

import factory.products.Supa;
import factory.products.SupaCiuperci;
import factory.products.SupaLegume;
import factory.products.SupaVita;

public class Bucatarie {

    private int cantitate;
    private float pret;

    public Bucatarie(int cantitate, float pret) {
        this.cantitate = cantitate;
        this.pret = pret;
    }


    public Supa getSupa(TipSupa tipSupa, int discount, boolean hasSmantana, boolean hasArdei) {
        switch (tipSupa) {
            case VITA -> {
                return new SupaVita(discount, this.cantitate, this.pret, hasArdei, hasSmantana);
            }
            case LEGUME -> {
                return new SupaLegume(discount, this.cantitate, this.pret, hasArdei, hasSmantana);
            }
            case CIUPERCI -> {
                return new SupaCiuperci(discount, this.cantitate, this.pret, hasArdei, hasSmantana);
            }
            default -> {
                return null;
            }
        }
    }

}
