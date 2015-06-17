import java.util.Comparator;


public class CompareTeamPoints implements Comparator<Team>
{
	public int compare(Team t1, Team t2)
	{
		if(t1.getTeamPoints() > t2.getTeamPoints())
			return 1;
		else if(t1.getTeamPoints() < t2.getTeamPoints())
			return -1;
		else
			return 0;
	}
}
