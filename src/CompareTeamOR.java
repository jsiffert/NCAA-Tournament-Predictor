import java.util.Comparator;


public class CompareTeamOR implements Comparator<Team>
{
	public int compare(Team t1, Team t2)
	{
		if(t1.getTeamORB() > t2.getTeamORB())
			return 1;
		else if(t1.getTeamORB() < t2.getTeamORB())
			return -1;
		else
			return 0;
	}
}
