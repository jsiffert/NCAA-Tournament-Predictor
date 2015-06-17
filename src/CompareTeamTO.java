import java.util.Comparator;


public class CompareTeamTO implements Comparator<Team>
{
	public int compare(Team t1, Team t2)
	{
		if(t1.getTeamTO() > t2.getTeamTO())
			return 1;
		else if(t1.getTeamTO() < t2.getTeamTO())
			return -1;
		else
			return 0;
	}
}
