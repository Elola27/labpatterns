package adapter;

import java.util.List;

public class Covid19PacientInvertedIterartor implements InvertedIterator {

	private List<Object> list;
	private int posizioa;

	public Covid19PacientInvertedIterartor(List<Object> list) {
		this.list = list;
		posizioa = 0;
	}

	// return the actual element and go to the previous
	public Object previous() {
		posizioa++;
		return list.get(posizioa - 1);
	}

	// true if there is a previous element
	public boolean hasPrevious() {
		return posizioa < list.size();
	}

	// It is placed in the last element
	public void goLast() {
		posizioa = 0;
	}

}
