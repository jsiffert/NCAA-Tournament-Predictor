
public class NormalizeTeams 
{
	private double avgPoints; // points
	private double avgPointsAgainst; // other teams points
	private double avgORB; // offensive rebounds
	private double avgDRB; // defensive rebounds
	private double avgAssists; // assists 
	private double avgSteals; // steals
	private double avgBlocks; // blocks 
	private double avgTO; // turn overs 
	
	public void normalize(Team[] teams)
	{
		for(int i = 0; i < teams.length; i++)
		{
			avgPoints += teams[i].getTeamPoints();
			avgPointsAgainst += teams[i].getTeamPointsAgainst();
			avgORB += teams[i].getTeamORB();
			avgDRB += teams[i].getTeamDRB();
			avgAssists += teams[i].getTeamAssists();
			avgSteals += teams[i].getTeamSteals();
			avgBlocks += teams[i].getTeamBlocks();
			avgTO += teams[i].getTeamTO();
		}
		
		//System.out.println(avgPoints + " " + avgPointsAgainst+ " " + avgORB + " " + avgDRB + " " + avgAssists + " " + avgSteals + " " + avgBlocks + " " + avgTO);
		
			
		avgPoints /= teams.length; 
		avgPointsAgainst /= teams.length;
		avgORB /= teams.length; 
		avgDRB /= teams.length; 
		avgAssists /= teams.length; 
		avgSteals /= teams.length; 
		avgBlocks /= teams.length;
		avgTO /= teams.length;
		
		
		//System.out.println(avgPoints + " " + avgPointsAgainst+ " " + avgORB + " " + avgDRB + " " + avgAssists + " " + avgSteals + " " + avgBlocks + " " + avgTO);
		//OFFENCE
		//System.out.println(avgPoints + " " + avgAssists + " " + avgORB + " " + avgTO);
		
		
		
		for(int i = 0; i < teams.length; i++)
		{
			teams[i].setTeamStatsNorm
			(teams[i].getTeamPoints() - avgPoints, 
		     teams[i].getTeamPointsAgainst() - avgPointsAgainst, 
			 teams[i].getTeamORB() - avgORB, 
			 teams[i].getTeamDRB() - avgDRB, 
			 teams[i].getTeamAssists() - avgAssists, 
			 teams[i].getTeamSteals() - avgSteals, 
			 teams[i].getTeamBlocks() - avgBlocks, 
			 teams[i].getTeamTO() - avgTO);
		}	
	}
	
	
	
	public double getAvGPoints(){ return avgPoints;}
	public double getAvgPointsAgainst(){ return avgPointsAgainst;}
	public double getAvgORB(){ return avgORB;}
	public double getAvgDRB(){ return avgDRB;}
	public double getAvgAssists(){ return avgAssists;}
	public double getAvgSteals(){ return avgSteals;}
	public double getAvgBlocks(){ return avgBlocks;}
	public double getAvgTO(){ return avgTO;}
}
