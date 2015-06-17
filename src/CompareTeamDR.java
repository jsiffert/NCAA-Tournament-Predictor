import java.util.Comparator;


public class CompareTeamDR implements Comparator<Team>
{
	public int compare(Team t1, Team t2)
	{
		if(t1.getTeamDRB() > t2.getTeamDRB())
			return 1;
		else if(t1.getTeamDRB() < t2.getTeamDRB())
			return -1;
		else
			return 0;
	}
}
