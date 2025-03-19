package cts.reader;

import cts.dto.Aplicant;
import cts.dto.Elev;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends BaseReader {

    public EleviReader(String filename) {
        super(filename);
    }

    @Override
    public List<Aplicant> readAplicant() throws IOException {
        Scanner input2 = new Scanner(new File(super.fileName));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            String nume = input2.next();
            String prenume = input2.next();
            int varsta = input2.nextInt();
            int punctaj = input2.nextInt();
            int nr = input2.nextInt();
            String[] vect = new String[5];
            for (int i = 0; i < nr; i++)
                vect[i] = input2.next();
            int clasa = input2.nextInt();
            String tutore = input2.next();
            Aplicant e = new Elev(nume, prenume, varsta, punctaj, nr, vect, clasa, tutore);
            elevi.add(e);
        }

        input2.close();
        return elevi;
    }

}
