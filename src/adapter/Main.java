package adapter;

import domain.Covid19Pacient;
import domain.Symptom;
import domain.SymptomSortzailea;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p = new Covid19Pacient("Unax", 20, new SymptomSortzailea());
		p.addSymptom(new Symptom("s1", 10, 11), 1);
		p.addSymptom(new Symptom("s2", 10, 12), 2);
		p.addSymptom(new Symptom("s3", 10, 8), 3);
		p.addSymptom(new Symptom("s4", 10, 2), 4);
		p.addSymptom(new Symptom("s5", 10, 7), 5);
		Set<Symptom> giltzak = p.getSymptoms();
		Iterator giltzIt = giltzak.iterator();
		ArrayList<Object> keys = new ArrayList<Object>();
		Symptom sy;
		while (giltzIt.hasNext())
			keys.add(giltzIt.next());
		Sorting s = new Sorting();
		Iterator<Object> it1 = s.sortedIterator(new Covid19PacientInvertedIterartor(keys), new comparateSymptomName());

		System.out.println("Emaitza, string kasurako:\n");
		Symptom s1;
		while (it1.hasNext()) {
			s1 = (Symptom) it1.next();
			System.out.println("Izena: " + s1.getName() + " Severity: " + s1.getSeverityIndex());
		}

		Iterator<Object> it2 = s.sortedIterator(new Covid19PacientInvertedIterartor(keys), new compareSeverityIndex());

		System.out.println("Emaitza, severity kasurako:\n");
		Symptom s2;
		while (it2.hasNext()) {
			s2 = (Symptom) it2.next();
			System.out.println("Izena: " + s2.getName() + " Severity: " + s2.getSeverityIndex());
		}

	}
}
