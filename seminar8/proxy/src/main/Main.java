package proxy.src.main;

import proxy.src.modules.IRezervare;
import proxy.src.modules.ProxyNrPersoane;
import proxy.src.modules.ProxyOra;
import proxy.src.modules.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        rezervare.rezerva("Gigel", 5, 15);

        IRezervare proxy = new ProxyNrPersoane(rezervare);
        proxy.rezerva("Gigel", 3, 15);

        IRezervare proxyOra = new ProxyOra(proxy);
        proxyOra.rezerva("Popescu",5,19);
    }
}