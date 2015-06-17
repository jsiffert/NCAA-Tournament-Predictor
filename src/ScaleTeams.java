import java.util.Arrays;


public class ScaleTeams 
{
	private double teamScale;
	
	
	// OFFENCE 
	public void scalePoints(Team[] teams)
	{
		Arrays.sort(teams, new CompareTeamPoints());
		teamScale = 1.0 / 16.0;
		
		//System.out.println("TEAM POINTS");
		for(int i = 0; i < teams.length; i++)
		{
			teams[i].setPointsRaiting(teamScale);
			//System.out.println(teams[i].getTeamName() + "   " + teams[i].getTeamPoints() + "  " + teamScale);
			teamScale += 1.0 / 16.0;
		}
		
    }
	
	public void scaleAssists(Team[] teams)
	{
		Arrays.sort(teams, new CompareTeamAssists());
		teamScale = 1.0 / 16.0;
		
		//System.out.println("TEAM ASSISTS");
		for(int i = 0; i < teams.length; i++)
		{
			teams[i].setAssistRaiting(teamScale);
			//System.out.println(teams[i].getTeamName() + "   " + teams[i].getTeamAssists() + "  " + teamScale);
			teamScale += 1.0 / 16.0;
		}
    }
	
	public void scaleOR(Team[] teams)
	{
		Arrays.sort(teams, new CompareTeamOR());
		teamScale = 1.0 / 16.0;
		
		//System.out.println("TEAM OR");
		for(int i = 0; i < teams.length; i++)
		{
			teams[i].setORBRaiting(teamScale);
			//System.out.println(teams[i].getTeamName() + "   " + teams[i].getTeamORB() + "  " + teamScale);
			teamScale += 1.0 / 16.0;
		}
    }
		
	
	public void scaleTO(Team[] teams)
	{
		Arrays.sort(teams, new CompareTeamTO());
		teamScale = 1.0;
		
		//System.out.println("TEAM TO");
		for(int i = 0; i < teams.length; i++)
		{
			teams[i].setTORaiting(teamScale);
			//System.out.println(teams[i].getTeamName() + "   " + teams[i].getTeamTO() + "  " + teamScale);
			teamScale -= 1.0 / 16.0;
		}
    }
	
	
	
	
	
	//DEFFENCE
	
	public void scalePointsAgainst(Team[] teams)
	{
		Arrays.sort(teams, new CompareTeamPointsAgainst());
		teamScale = 1.0;
		
		//System.out.println("TEAM PA");
		for(int i = 0; i < teams.length; i++)
		{
			teams[i].setPointsAgainstRaiting(teamScale);
			//System.out.println(teams[i].getTeamName() + "   " + teams[i].getTeamPointsAgainst() + "  " + teamScale);
			teamScale -= 1.0 / 16.0;
		}
		
    }
	
	public void scaleDR(Team[] teams)
	{
		Arrays.sort(teams, new CompareTeamDR());
		teamScale = 1.0 / 16.0;
		
		//System.out.println("TEAM DR");
		for(int i = 0; i < teams.length; i++)
		{
			teams[i].setDRBRaiting(teamScale);
			//System.out.println(teams[i].getTeamName() + "   " + teams[i].getTeamDRB() + "  " + teamScale);
			teamScale += 1.0 / 16.0;
		}
    }
	
	public void scaleSteals(Team[] teams)
	{
		Arrays.sort(teams, new CompareTeamSteals());
		teamScale = 1.0 / 16.0;
		
		//System.out.println("TEAM STEALS");
		for(int i = 0; i < teams.length; i++)
		{
			teams[i].setStealsRaiting(teamScale);
			
			//System.out.println(teams[i].getTeamName() + "   " + teams[i].getTeamSteals() + "  " + teamScale);
			teamScale += 1.0 / 16.0;
		}
    }
	
	public void scaleBlocks(Team[] teams)
	{
		Arrays.sort(teams, new CompareTeamBlocks());
		teamScale = 1.0 / 16.0;
		
		//System.out.println("TEAM BLOCKS");
		for(int i = 0; i < teams.length; i++)
		{
			teams[i].setBlocksRaiting(teamScale);
			//System.out.println(teams[i].getTeamName() + "   " + teams[i].getTeamBlocks() + "  " + teamScale);
			teamScale += 1.0 / 16.0;
		}
    }

}
