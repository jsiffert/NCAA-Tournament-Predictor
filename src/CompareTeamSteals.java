import java.util.Comparator;


public class CompareTeamSteals implements Comparator<Team>
{
	public int compare(Team t1, Team t2)
	{
		if(t1.getTeamSteals() > t2.getTeamSteals())
			return 1;
		else if(t1.getTeamSteals() < t2.getTeamSteals())
			return -1;
		else
			return 0;
	}
}
