package ex1;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>();
	// private DataSheetView dataSheetView;
	private MinMaxView minMaxView;	
	
	protected void setDataSheetView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView;
	}
	
	protected void addScore(int score) { // 새로운 점수를 추가
		scores.add(score);
		minMaxView.update();
	}
	
	protected List<Integer> getScoreRecord() {
		return scores;
	}
}
