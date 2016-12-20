/**
 * Created by jc346395 on 15/12/2016.
 */
public class DemoLLBaseballGame {
    public static void main(String[] args)
    {
        LittleLeagueBaseballGame game1 = new LittleLeagueBaseballGame("One", "Two");
        game1.setTeam1Score(0, 10);
        game1.setTeam2Score(2, 100);
        game1.setTeam2Score(0, 20);
        game1.setTeam2Score(6,20);
        System.out.println(game1.getTeam1Score(0));
        System.out.println(game1.getTeam2Score(0));
        System.out.println(game1.getTeam1Name());
    }
}
