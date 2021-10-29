package adapter;

import java.util.Comparator;

import domain.Symptom;

public class compareSeverityIndex implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Symptom syp1 = (Symptom) o1;
		Integer i1 = syp1.getSeverityIndex();
		Symptom syp2 = (Symptom) o2;
		Integer i2 = syp2.getSeverityIndex();
		return i1.compareTo(i2);
	}

}
