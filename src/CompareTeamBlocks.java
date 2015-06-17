import java.util.Comparator;


public class CompareTeamBlocks implements Comparator<Team>
{
	public int compare(Team t1, Team t2)
	{
		if(t1.getTeamBlocks() > t2.getTeamBlocks())
			return 1;
		else if(t1.getTeamBlocks() < t2.getTeamBlocks())
			return -1;
		else
			return 0;
	}
}
