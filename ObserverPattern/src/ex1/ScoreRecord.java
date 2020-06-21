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
	
	protected void addScore(int score) { // ���ο� ������ �߰�
		scores.add(score);
		minMaxView.update();
	}
	
	protected List<Integer> getScoreRecord() {
		return scores;
	}
}
