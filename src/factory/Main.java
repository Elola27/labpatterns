package factory;

import domain.Covid19Pacient;
import domain.Medicament;
import domain.SymptomSortzailea;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p1=new Covid19Pacient("aitor", 35,new SymptomSortzailea());
		new PacientSymptomGUI(p1);
		/*Medicament m=new Medicament("Ibuprofeno", new SymptomSortzailea());
		MedicalGUI mgui=new MedicalGUI(m);*/
		//a
	}

}
