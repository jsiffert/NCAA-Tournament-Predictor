import java.util.Comparator;


public class CompareTeamPointsAgainst implements Comparator<Team>
{
	public int compare(Team t1, Team t2)
	{
		if(t1.getTeamPointsAgainst() > t2.getTeamPointsAgainst())
			return 1;
		else if(t1.getTeamPointsAgainst() < t2.getTeamPointsAgainst())
			return -1;
		else
			return 0;
	}
}
