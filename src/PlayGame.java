
public class PlayGame 
{
	private Team t1;
	private Team t2;
	
	private double t1_Oscore;
	private double t2_Oscore;
	
	private double t1_Dscore;
	private double t2_Dscore;
	
	private double t1score;
	private double t2score;
	
	
	
	private double t1COV;
	private double t2COV;
	
	
	public void play(Team team1, Team team2)
	{
		t1 = team1;
		t2 = team2;
		
		//CALC OFFENSIVE SCORE
		t1_Oscore = (t1.getPointsRaiting() * 4) + (t1.getAssistRaiting() * 3) + (t1.getORBRaiting() * 2) + (t1.getTORaiting() * 1); 
		t2_Oscore = (t2.getPointsRaiting() * 4) + (t2.getAssistRaiting() * 3) + (t2.getORBRaiting() * 2) + (t2.getTORaiting() * 1); 
		
		//CLAC DEFFENSVE SCORE 
		t1_Dscore = (t1.getPointsAgainstRaiting() * 4) + (t1.getDRBRaiting() * 3) + (t1.getStealsRaiting() * 2) + (t1.getBlocksRaiting() * 1); 
		t2_Dscore = (t2.getPointsAgainstRaiting() * 4) + (t2.getDRBRaiting() * 3) + (t2.getStealsRaiting() * 2) + (t2.getBlocksRaiting() * 1); 
		
		System.out.println("O SCORE" +  t1_Oscore + "    " + t2_Oscore);
		System.out.println("D SCORE" +  t1_Dscore + "    " + t2_Dscore);
		
		t1score = t1_Oscore - t2_Dscore;
		t2score = t2_Oscore - t1_Dscore;
		
		
		t1COV = t1score / (t1score + t2score);
		t2COV = t2score / (t1score + t2score);
		
		System.out.println(t1.getTeamName() + " " + t1COV + "    " + t2.getTeamName() + " " + t2COV);	
	}
	
	
	public Team newPlay(Team team1, Team team2, int hw, int  aw, int games)
	{
		
		//hw = home wins, aw = away wins, aw/hw = Mc, games = M 
		
		double homeScore;
		double awayScore;
		double gameVec[] = new double[16];
		
		//Create the vector for the game
		//First 8 will be team 1, the home team, second 8 will be team 2 the away team
		
		//Team 1 Offence 
		gameVec[0] = team1.getPointsNorm();
		gameVec[1] = team1.getAssistsNorm();
		gameVec[2] = team1.getORBNorm();
		gameVec[3] = team1.getTONorm();
		//Team 1 Deffence 
		gameVec[4] = team1.getPointsAgainstNorm();
		gameVec[5] = team1.getDRBNorm();
		gameVec[6] = team1.getStealsNorm();
		gameVec[7] = team1.getBlocksNorm();
		
		//Team 2 Offence 
		gameVec[8] = team2.getPointsNorm();
		gameVec[9] = team2.getAssistsNorm();
		gameVec[10] = team2.getORBNorm();
		gameVec[11] = team2.getTONorm();
		//Team 2 Deffence 
		gameVec[12] = team2.getPointsAgainstNorm();
		gameVec[13] = team2.getDRBNorm();
		gameVec[14] = team2.getStealsNorm();
		gameVec[15] = team2.getBlocksNorm();
		
		homeScore = calcClassifiers(gameVec,1,hw, games);
		awayScore = calcClassifiers(gameVec,-1,aw, games);	
		
		
		System.out.println("Home Team " + homeScore + "  Away Team " + awayScore);
		
		if(homeScore > awayScore)
			return team1;
		else
			return team2;
		
		
		
		
		
	}
	
	public double calcClassifiers(double vec[], int c, int mc, int m )
	{
		double U = 0;
		double R = 0;
		double score = 0; 
		
		for(int i = 0; i < 16; i++)
		{
			U += (vec[i] * c);
		}
		
		   U /= mc; 
		
		
		for(int i = 0; i < 16; i++)
		{
			R += Math.pow((vec[i] - U),2); 
		}
			R /= mc; 
			
	
	
		for(int i = 0; i < 16; i++)
		{
			score += ((-1/2)* (Math.pow((vec[i] - U), 2 ) / R)) - Math.log10(R);
		}
		
		double piC = (double) mc / (double) m;
		
		score += Math.log10(piC);
		
		
		return score; 		
		
	}

}
