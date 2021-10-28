package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import domain.SymptomSortzailea;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable pacient=new Covid19Pacient("aitor", 35, new SymptomSortzailea());
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient);
		PacientSymptomGUI frame = new PacientSymptomGUI ((Covid19Pacient)pacient);
		PacientThermometerGUI frame2= new PacientThermometerGUI((Covid19Pacient) pacient);
		SemaphorGUI frame3= new SemaphorGUI((Covid19Pacient)pacient);
	}


}
