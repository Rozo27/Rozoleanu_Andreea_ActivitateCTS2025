package cts.reader;

import cts.dto.Angajat;
import cts.dto.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends BaseReader {

    public AngajatiReader(String filename) {
        super(filename);
    }

    @Override
    public List<Aplicant> readAplicant() throws IOException {
        Scanner input2 = new Scanner(new File(super.fileName));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input2.hasNext()) {
            int salariu = input2.nextInt();
            String ocupatie = input2.next();

            Angajat angajat = new Angajat();
            citireAplicant(angajat, input2);
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);

        }
        input2.close();
        return angajati;
    }
}
