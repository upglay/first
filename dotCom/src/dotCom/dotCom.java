package dotCom;

import java.util.ArrayList;

public class dotCom {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/
	private ArrayList<String> locationCells;
	private String name;
	
	public void setLocationCells(ArrayList<String> locs){
		locationCells = locs;
	}
	
	public String checkYourself (String userInput){
		
		
		String result = "miss";
		
		int index = locationCells.indexOf(userInput);
		
		if(index >= 0){
			locationCells.remove(index);
			
			if(locationCells.isEmpty()){
				result = "kill";
			} else{
				result = "hit";
			}
		}
		
		return result;
	}

	public void setName(String n) {
		// TODO Auto-generated method stub
		name = n;
	}	
}
