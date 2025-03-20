package prototype;

public class Main {
    public static void main(String[] args) {
        Rezervare rez = new RezervareImpl("Andreea", 12, 20, 2);
        Rezervare rezCloned = rez.clone(25);

        System.out.println(rez);
        System.out.println(rezCloned);
    }
}
