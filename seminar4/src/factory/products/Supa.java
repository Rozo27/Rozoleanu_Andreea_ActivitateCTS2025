package factory.products;

public abstract class Supa {

    private int cantitate;

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public boolean isHasArdei() {
        return hasArdei;
    }

    public void setHasArdei(boolean hasArdei) {
        this.hasArdei = hasArdei;
    }

    public boolean isHasSmantana() {
        return hasSmantana;
    }

    public void setHasSmantana(boolean hasSmantana) {
        this.hasSmantana = hasSmantana;
    }

    private float pret;
    private boolean hasArdei;
    private boolean hasSmantana;

    public Supa(float pret, boolean hasArdei, boolean hasSmantana, int cantitate) {
        this.pret = pret;
        this.hasArdei = hasArdei;
        this.hasSmantana = hasSmantana;
        this.cantitate = cantitate;
    }

    public abstract void afiseazaDescriere();

    public abstract float calculeazaPretFinal();
}
