package cts.reader;

import cts.dto.Aplicant;
import cts.dto.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends BaseReader {

    public StudentiReader(String filename) {
        super(filename);
    }

    //TBD:
    @Override
    public List<Aplicant> readAplicant() throws IOException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student student = new Student();

            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            Aplicant s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
            studenti.add(s);
        }
        input.close();
        return studenti;
    }

}
