/**
 * Created by jc346395 on 15/12/2016.
 */
public class LittleLeagueBaseballGame extends BaseballGame {
    public LittleLeagueBaseballGame(String team1Name, String team2Name) {
        super(team1Name, team2Name);
    }
    public void setTeam1Score(int inning, int score) {
        if(inning > 5)
        {
            System.out.println("No inning "+ inning);}
        else
        {super.setTeam1Score(inning, score);}
    }
    public void setTeam2Score(int inning, int score) {
        if (inning > 5)
        {System.out.println("No inning "+ inning);}
        else {
            super.setTeam2Score(inning,score);
        }
    }
}
