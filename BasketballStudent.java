/**
 * 
 */
package athlete_package;

/**
 * @author em04743
 *
 */
public class BasketballStudent extends StudentAthlete implements Basketball {

	/**
	 * @param args
	 */
	public static int FieldGoalsAttempted;
	public static int FieldGoalsMade;
	public static int GamesPlayed;
	public static int GamesStarted;
	
	public BasketballStudent(String fName, String lName, int eid){
		super(fName, lName, eid);
	}
	public void setFieldGoalsAttempted(int fieldGoalsAttempted){
		fieldGoalsAttempted=this.FieldGoalsAttempted;
	}public void setFieldGoalsMade(int fieldGoalsMade){
		fieldGoalsMade= this.FieldGoalsMade;
	}public void setGamesPlayed(int gamesPlayed){
		gamesPlayed = this.GamesPlayed;
	}public void setGamesStarted(int gamesStarted){
		gamesStarted = this.GamesStarted;
	}
	public int getFieldGoalsAttempted(){
		return this.FieldGoalsAttempted;
	}public int getFieldGoalsMade(){
		return this.FieldGoalsMade;
	}public int getGamesPlayed(){
		return this.GamesPlayed;
	}public int getGamesStarted(){
		return this.GamesStarted;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
