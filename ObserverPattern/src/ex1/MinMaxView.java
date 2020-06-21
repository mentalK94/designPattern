package ex1;

import java.util.Collections;
import java.util.List;

public class MinMaxView {
	private ScoreRecord scoreRecord;
	
	protected MinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	protected void update() { // 점수의 변경을 통보받음
		List<Integer> record = scoreRecord.getScoreRecord();
		displayMinMax(record);
	}
	
	private void displayMinMax(List<Integer> record) {
		int min = Collections.min(record, null);
		int max = Collections.max(record, null);
		System.out.println("min : " + min + ", max : " + max);
	}
}
