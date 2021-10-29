package adapter;

import java.util.Comparator;

import domain.Symptom;

public class comparateSymptomName implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Symptom syp1 = (Symptom) o1;
		String s1 = syp1.getName();
		Symptom syp2 = (Symptom) o2;
		String s2 = syp2.getName();
		return s1.compareTo(s2);
	}
}
