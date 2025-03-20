package factory.products;

public class SupaVita extends Supa {
    private int discount;

    public SupaVita(int discount, int cantitate, float pret, boolean hasArdei, boolean hasSmantana) {
        super(pret, hasArdei, hasSmantana, cantitate);
        this.discount = discount;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa vita: " + super.getPret() + " RON");
    }

    @Override
    public float calculeazaPretFinal() {
        return super.getPret() - this.discount;
    }
}
