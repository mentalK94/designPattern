package ex1;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
	
	private List<Integer> scores = new ArrayList<Integer>();
	
	protected void addScore(int score) { // 새로운 점수를 추가
		scores.add(score);
		
		notifyObservers(); // 각 옵저버에게 데이터의 변경을 통보
	}
	
	protected List<Integer> getScoreRecord() {
		return scores;
	}
}
