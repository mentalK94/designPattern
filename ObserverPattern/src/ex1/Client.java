package ex1;

public class Client {

	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		
		DataSheetView dataSheetView = new DataSheetView(3, scoreRecord);
		MinMaxView minMaxView = new MinMaxView(scoreRecord);
		
		// scoreRecord.setDataSheetView(dataSheetView);
		scoreRecord.setDataSheetView(minMaxView);
		
		for(int i=1; i<=7; i++) {
			int score = i*10;
			scoreRecord.addScore(score);
		}
	}

}
