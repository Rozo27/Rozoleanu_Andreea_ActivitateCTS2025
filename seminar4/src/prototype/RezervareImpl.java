package prototype;

public class RezervareImpl extends Rezervare {
    protected boolean isInterior;

    public RezervareImpl(String nume, int ora, int ziLuna, int noPersoane) {
        super(nume, ora, ziLuna, noPersoane);
    }

    public RezervareImpl() {
        super();
        this.isInterior = true;
    }

    @Override
    public Rezervare clone(int ziLuna) {
        RezervareImpl rez = new RezervareImpl();
        rez.isInterior = isInterior;
        rez.ora = this.ora;

        if(ziLuna >= 1 && ziLuna < 31) {
            rez.ziLuna = ziLuna;
        } else {
            rez.ziLuna = 1;
        }
        rez.noPersoane = this.noPersoane;
        rez.nume = this.nume;
        return rez;
    }

    @Override
    public String toString() {
        return "RezervareImpl{" +
                "isInterior=" + isInterior +
                ", nume='" + nume + '\'' +
                ", ora=" + ora +
                ", ziLuna=" + ziLuna +
                ", noPersoane=" + noPersoane +
                '}';
    }
}
