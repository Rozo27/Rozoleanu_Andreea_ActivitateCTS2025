package cts.dto;

import cts.reader.AngajatiReader;
import cts.reader.BaseReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		BaseReader baseReader = new AngajatiReader("angajati.txt");
		try {
			listaAplicanti = baseReader.readAplicant();
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
