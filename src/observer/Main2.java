package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import domain.SymptomSortzailea;

public class Main2 {

	public static void main(String[] args) {
		Observable pacient1=new Covid19Pacient("aitor", 35, new SymptomSortzailea());
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient1);
		PacientSymptomGUI frame = new PacientSymptomGUI ((Covid19Pacient)pacient1);
		PacientThermometerGUI termometro= new PacientThermometerGUI((Covid19Pacient)pacient1);
		
		
		Observable pacient2=new Covid19Pacient("karlos", 24, new SymptomSortzailea());
		PacientObserverGUI pacientGUI2= new PacientObserverGUI (pacient2);
		PacientSymptomGUI frame2 = new PacientSymptomGUI ((Covid19Pacient)pacient2);
		PacientThermometerGUI termometro2= new PacientThermometerGUI((Covid19Pacient)pacient2);
		
		Observable pacient3=new Covid19Pacient("jose", 47, new SymptomSortzailea());
		PacientObserverGUI pacientGUI3= new PacientObserverGUI (pacient3);
		PacientSymptomGUI frame3 = new PacientSymptomGUI ((Covid19Pacient)pacient3);
		PacientThermometerGUI termometro3= new PacientThermometerGUI((Covid19Pacient)pacient3);
	}
}
