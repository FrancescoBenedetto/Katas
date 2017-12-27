package bowling;

public class Bowling {

	int[][] frames;
	
	public Bowling(int[][]frames){
		this.frames = frames;
	}
	
	public int getScore() {
		int totalScore = 0;
		int actual_frame = 0;
		for(int i=0; i<10; i++){
			int[] frame = frames[i];
			if(isStrike(frame)){
				totalScore+=frames[actual_frame+1][0];
				if(frames[actual_frame+1][0]==10){
					totalScore+=frames[actual_frame+2][0];
				}
				else {
				    totalScore+=frames[actual_frame+1][1];
				}
			}
			else if(isSpare(frame) && frames[actual_frame+1]!=null){
				totalScore += frames[actual_frame+1][0]; 
			}
			totalScore += frame[0]+frame[1];
			actual_frame++;
		}
		
		return totalScore;
	}
	
	private boolean isSpare(int[] frame){
		return frame[0]+frame[1]==10;
	}
	
	private boolean isStrike(int[] frame){
		return frame[0]==10;
	}
}
