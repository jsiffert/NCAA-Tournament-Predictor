import java.util.Comparator;


public class CompareTeamAssists implements Comparator<Team>
{
	public int compare(Team t1, Team t2)
	{
		if(t1.getTeamAssists() > t2.getTeamAssists())
			return 1;
		else if(t1.getTeamAssists() < t2.getTeamAssists())
			return -1;
		else
			return 0;
	}
}
