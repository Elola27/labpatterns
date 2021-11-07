package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import domain.SymptomSortzailea;

public class Main1 {

	/**
	 * Launch the application.
	 */
	public static void main1(String[] args) {
		Observable pacient=new Covid19Pacient("aitor", 35, new SymptomSortzailea());
		PacientObserverGUI pacientGUI1= new PacientObserverGUI (pacient);
		PacientSymptomGUI frame1 = new PacientSymptomGUI ((Covid19Pacient)pacient);
	}
}
