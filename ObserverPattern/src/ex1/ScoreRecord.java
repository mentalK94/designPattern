package ex1;

import java.util.List;

public class ScoreRecord {
	private List<Integer> scores;
	private DataSheetView dataSheetView;
	
	protected void setDataSheetView(DataSheetView dataSheetView) {
		this.dataSheetView = dataSheetView;
	}
	
	protected void addScore(int score) {
		scores.add(score);
	}
	
	protected List<Integer> getScoreRecord() {
		return scores;
	}
}
