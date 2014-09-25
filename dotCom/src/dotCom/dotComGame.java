package dotCom;

public class dotComGame {
	
	public static void main(String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		dotCom dot = new dotCom();
		int randomNum = (int) (Math.random() % 5);
		int [] locations = {randomNum, randomNum+1, randomNum+2};
		dot.setLocationCells(locations);
		
		boolean isAlive = true;
		
		while(isAlive == true) {
			String guess = helper.getUserInput("enter a number");
			String result = dot.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")){
				isAlive = false;
				System.out.println(numOfGuesses + " guesses");
			}
		}
		
	}

}
