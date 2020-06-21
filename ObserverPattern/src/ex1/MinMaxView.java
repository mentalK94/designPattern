package ex1;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {
	private ScoreRecord scoreRecord;
	
	public MinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	public void update() { // ������ ������ �뺸����
		List<Integer> record = scoreRecord.getScoreRecord();
		displayMinMax(record);
	}
	
	public void displayMinMax(List<Integer> record) {
		int min = Collections.min(record, null);
		int max = Collections.max(record, null);
		System.out.println("min : " + min + ", max : " + max);
	}
}
