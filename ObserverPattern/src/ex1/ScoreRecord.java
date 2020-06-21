package ex1;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
	
	private List<Integer> scores = new ArrayList<Integer>();
	
	protected void addScore(int score) { // ���ο� ������ �߰�
		scores.add(score);
		
		notifyObservers(); // �� ���������� �������� ������ �뺸
	}
	
	protected List<Integer> getScoreRecord() {
		return scores;
	}
}
