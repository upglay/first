package dotCom;

public class dotCom {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/
	int[] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells(int[] locs){
		locationCells = locs;
	}
	
	public String checkYourself (String stringGuess){
		
		int guess = Integer.parseInt(stringGuess);
		
		String result = "miss";
		
		for(int i = 0; i < locationCells.length; i++){
			if(guess == locationCells[i]){
				result = "hit";
				numOfHits++;
				break;
			}
		}
		
		if(numOfHits == locationCells.length){
			result = "kill";
		}
		
		System.out.println(result);
		
		return result;
	}	
}
