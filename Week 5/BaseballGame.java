/**
 * Created by jc346395 on 15/12/2016.
 */
public class BaseballGame {
    private String team1;
    private String team2;
    private int[] team1Score;
    private int[] team2Score;

    public BaseballGame(String team1Name, String team2Name)
    {
        this.team1 = team1Name;
        this.team2 = team2Name;
        this.team1Score = new int[9];
        for (int i = 0; i <team1Score.length;i++)
        {
            team1Score[i]= -1;
        }
        this.team2Score = new int[9];
        for (int i = 0; i < team2Score.length;i++)
        {
            team2Score[i]= -1;
        }
    }

    public String getTeam1Name() {
        return team1;
    }

    public void setTeam1Name(String team1Name) {
        this.team1 = team1Name;
    }

    public String getTeam2Name() {
        return team2;
    }

    public void setTeam2Name(String team2Name) {
        this.team2 = team2Name;
    }

    public int getTeam1Score(int inning) {
        return team1Score[inning];
    }

    public void setTeam1Score(int inning, int score) {
        if(inning<countInning(team1Score))
        {
            System.out.println("Cannot change inning score");
        }
        else
        if(inning>team1Score.length)
        {
            System.out.println("Game already over");
        }
        else
        if(inning>countInning(team1Score))
        {
            System.out.println("Haven't reach that inning");
        }
        else
        {team1Score[inning] = score ;}
    }

    public int getTeam2Score(int inning) {
        return team2Score[inning];
    }

    public void setTeam2Score(int inning, int score) {
        if(inning<countInning(team2Score))
        {
            System.out.println("Cannot change inning score");
        }
        else
        if(inning>team2Score.length)
        {
            System.out.println("Game already over");
        }
        else
        if(inning>countInning(team2Score))
        {
            System.out.println("Haven't reach that inning");
        }
        else
        {team2Score[inning] = score ;}
    }

    public void add(String teamname, int score)
    {
        if(teamname.equals(team1))
        {
            setTeam1Score(countInning(team1Score), score);
        }
        else
        {
            setTeam2Score(countInning(team2Score), score);
        }

    }

    public int countInning(int[] teamscore)
    {
        int counter = 0;
        for(int i = 0; i<teamscore.length; i++)
        {
            if (teamscore[i] != -1)
            {
                counter++;
            }
        }
        return counter;
    }
}
