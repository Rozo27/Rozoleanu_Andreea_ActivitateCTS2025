package cts.reader;

import cts.dto.Aplicant;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public abstract class BaseReader {

    protected String fileName;

    BaseReader(String fileName) {
        this.fileName = fileName;
    }

    public abstract List<Aplicant> readAplicant() throws IOException;

    public void citireAplicant(Aplicant aplicant, Scanner input2) throws IOException {
        String nume = input2.next();
        String prenume = input2.next();
        int varsta = input2.nextInt();
        int punctaj = input2.nextInt();
        int nr = input2.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input2.next();


        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNrProiecte(nr, vect);
    }
}
