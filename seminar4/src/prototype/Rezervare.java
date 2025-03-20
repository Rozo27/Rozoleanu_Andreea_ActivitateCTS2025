package prototype;

public abstract class Rezervare {
    protected String nume;
    protected int ora;
    protected int ziLuna;
    protected int noPersoane;

    public Rezervare() {
        this.nume = "Nume Standard";
        this.ora = 10;
        this.ziLuna = 1;
        this.noPersoane = 1;
    }

    public Rezervare(String nume, int ora, int ziLuna, int noPersoane) {
        if(nume != null && nume.length() >= 3) {
            this.nume = nume;
        } else {
            this.nume = "numeTest";
        }

        if(ora > 10 && ora < 22) {
            this.ora = ora;
        } else {
            this.ora = 10;
        }

        if(ziLuna >= 1 && ziLuna < 31) {
            this.ziLuna = ziLuna;
        } else {
            this.ziLuna = 31;
        }
        this.noPersoane = noPersoane;
    }

    public abstract Rezervare clone(int zi);

}
