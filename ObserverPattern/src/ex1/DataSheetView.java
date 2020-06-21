package ex1;

import java.util.List;

public class DataSheetView implements Observer {
	
	private int viewCount;
	private ScoreRecord scoreRecord;
	
	public DataSheetView(int viewCount, ScoreRecord scoreRecord) {
		this.viewCount = viewCount;
		this.scoreRecord = scoreRecord;
	}

	public void update() { // 점수의 변경을 통보받음
		List<Integer> record = scoreRecord.getScoreRecord();
		displayScores(record, viewCount);
	}
	
	public void displayScores(List<Integer> record, int viewCount) {
		System.out.print(viewCount + " entries : ");
		for(int i = 0; i<viewCount && i<record.size(); i++) {
			System.out.print(record.get(i) + " ");
		}
		System.out.println();
	}

}
