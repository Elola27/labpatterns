package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import domain.SymptomSortzailea;

public class Main3 {

	public static void main(String[] args) {
		Observable pacient1=new Covid19Pacient("aitor", 35, new SymptomSortzailea());
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient1);
		PacientSymptomGUI frame = new PacientSymptomGUI ((Covid19Pacient)pacient1);
		PacientThermometerGUI termometro= new PacientThermometerGUI((Covid19Pacient)pacient1);
		SemaphorGUI semaforo= new SemaphorGUI((Covid19Pacient) pacient1);

	}

}
