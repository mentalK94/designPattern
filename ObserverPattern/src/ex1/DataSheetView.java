package ex1;

import java.util.List;

public class DataSheetView {
	
	private int viewCount;
	private ScoreRecord scoreRecord;
	
	protected DataSheetView(int viewCount, ScoreRecord scoreRecord) {
		this.viewCount = viewCount;
		this.scoreRecord = scoreRecord;
	}

	protected void update() { // 점수의 변경을 통보받음
		List<Integer> record = scoreRecord.getScoreRecord();
		displayScores(record, viewCount);
	}
	
	private void displayScores(List<Integer> record, int viewCount) {
		System.out.println(viewCount + " entries");
		for(int i = 0; i<viewCount; i++) {
			System.out.println(record.get(i));
		}
	}

}
