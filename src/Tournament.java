
public class Tournament 
{
	PlayGame pg = new PlayGame(); 
	int homeWins;
	int awayWins;
	private static Team[] midWestConf = new Team[16];
	private static Team[] westConf = new Team[16];
	private static Team[] eastConf = new Team[16];
	private static Team[] southConf = new Team[16];
	private static Team[] roundOneWinners = new Team[32];
	private static Team[] roundTwoWinners = new Team[16];
	private static Team[] roundThreeWinners = new Team[8];
	private static Team[] roundFourWinners = new Team[4];
	private static Team[] roundFiveWinners = new Team[2];
	private static Team Champion;
	
	public Tournament(Team[] east, Team[] south, Team[] west, Team[] midWest, int hw, int aw )
	{
		 eastConf = east;
		 southConf = south;
		 westConf = west;
		 midWestConf = midWest;
		 homeWins = hw;
		 awayWins = aw;
	}
	
	public void roundOne()
	{		
		System.out.println("NCAA March Madness Mens Basketball Playoffs ");
		System.out.println("ROUND 1");
		System.out.println("-------------");
		
		System.out.println("EAST DIVISION\n\n");

		System.out.println("Seed 1 " + eastConf[0].getTeamName() + " VS Seed 16 " + eastConf[15].getTeamName());
		roundOneWinners[0] = pg.newPlay(eastConf[0], eastConf[15], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[0].getTeamName() + "\n");
		
		System.out.println("Seed 2 " + eastConf[1].getTeamName() + " VS Seed 15 " + eastConf[14].getTeamName());
		roundOneWinners[1] = pg.newPlay(eastConf[1], eastConf[14], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[1].getTeamName() + "\n");
		
		System.out.println("Seed 3 " + eastConf[2].getTeamName() + " VS Seed 14 " + eastConf[13].getTeamName());
		roundOneWinners[2] = pg.newPlay(eastConf[2], eastConf[13], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[2].getTeamName() + "\n");
		
		System.out.println("Seed 4 " + eastConf[3].getTeamName() + " VS Seed 13 " + eastConf[12].getTeamName());
		roundOneWinners[3] = pg.newPlay(eastConf[3], eastConf[12], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[3].getTeamName() + "\n");
		
		System.out.println("Seed 5 " + eastConf[4].getTeamName() + " VS Seed 12 " + eastConf[11].getTeamName());
		roundOneWinners[4] = pg.newPlay(eastConf[4], eastConf[11], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[4].getTeamName() + "\n");
		
		System.out.println("Seed 6 " + eastConf[5].getTeamName() + " VS Seed 11 " + eastConf[10].getTeamName());
		roundOneWinners[5] = pg.newPlay(eastConf[5], eastConf[10], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[5].getTeamName() + "\n");
		
		System.out.println("Seed 7 " + eastConf[6].getTeamName() + " VS Seed 10 " + eastConf[9].getTeamName());
		roundOneWinners[6] = pg.newPlay(eastConf[6], eastConf[9], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[6].getTeamName() + "\n");
		
		System.out.println("Seed 8 " + eastConf[7].getTeamName() + " VS Seed 9 " + eastConf[8].getTeamName());
		roundOneWinners[7] = pg.newPlay(eastConf[7], eastConf[8], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[7].getTeamName() + "\n");
		
		System.out.println("\n\nMIDWEST DIVISION\n\n");

		System.out.println("Seed 1 " + midWestConf[0].getTeamName() + " VS Seed 16 " + midWestConf[15].getTeamName());
		roundOneWinners[8] = pg.newPlay(midWestConf[0], midWestConf[15], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[8].getTeamName() + "\n");
		
		System.out.println("Seed 2 " + midWestConf[1].getTeamName() + " VS Seed 15 " + midWestConf[14].getTeamName());
		roundOneWinners[9] = pg.newPlay(midWestConf[1], midWestConf[14], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[9].getTeamName() + "\n");
		
		System.out.println("Seed 3 " + midWestConf[2].getTeamName() + " VS Seed 14 " + midWestConf[13].getTeamName());
		roundOneWinners[10] = pg.newPlay(midWestConf[2], midWestConf[13], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[10].getTeamName() + "\n");
		
		System.out.println("Seed 4 " + midWestConf[3].getTeamName() + " VS Seed 13 " + midWestConf[12].getTeamName());
		roundOneWinners[11] = pg.newPlay(midWestConf[3], midWestConf[12], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[11].getTeamName() + "\n");
		
		System.out.println("Seed 5 " + midWestConf[4].getTeamName() + " VS Seed 12 " + midWestConf[11].getTeamName());
		roundOneWinners[12] = pg.newPlay(midWestConf[4], midWestConf[11], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[12].getTeamName() + "\n");
		
		System.out.println("Seed 6 " + midWestConf[5].getTeamName() + " VS Seed 11 " + midWestConf[10].getTeamName());
		roundOneWinners[13] = pg.newPlay(midWestConf[5], midWestConf[10], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[13].getTeamName() + "\n");
		
		System.out.println("Seed 7 " + midWestConf[6].getTeamName() + " VS Seed 10 " + midWestConf[9].getTeamName());
		roundOneWinners[14] = pg.newPlay(midWestConf[6], midWestConf[9], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[14].getTeamName() + "\n");
		
		System.out.println("Seed 8 " + midWestConf[7].getTeamName() + " VS Seed 9 " + midWestConf[8].getTeamName());
		roundOneWinners[15] = pg.newPlay(midWestConf[7], midWestConf[8], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[15].getTeamName() + "\n");
		
		
		System.out.println("\n\nWEST DIVISION\n\n");

		System.out.println("Seed 1 " + westConf[0].getTeamName() + " VS Seed 16 " + westConf[15].getTeamName());
		roundOneWinners[16] = pg.newPlay(westConf[0], westConf[15], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[16].getTeamName() + "\n");
		
		System.out.println("Seed 2 " + westConf[1].getTeamName() + " VS Seed 15 " + westConf[14].getTeamName());
		roundOneWinners[17] = pg.newPlay(westConf[1], westConf[14], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[17].getTeamName() + "\n");
		
		System.out.println("Seed 3 " + westConf[2].getTeamName() + " VS Seed 14 " + westConf[13].getTeamName());
		roundOneWinners[18] = pg.newPlay(westConf[2], westConf[13], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[18].getTeamName() + "\n");
		
		System.out.println("Seed 4 " + westConf[3].getTeamName() + " VS Seed 13 " + westConf[12].getTeamName());
		roundOneWinners[19] = pg.newPlay(westConf[3], westConf[12], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[19].getTeamName() + "\n");
		
		System.out.println("Seed 5 " + westConf[4].getTeamName() + " VS Seed 12 " + westConf[11].getTeamName());
		roundOneWinners[20] = pg.newPlay(westConf[4], westConf[11], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[20].getTeamName() + "\n");
		
		System.out.println("Seed 6 " + westConf[5].getTeamName() + " VS Seed 11 " + westConf[10].getTeamName());
		roundOneWinners[21] = pg.newPlay(westConf[5], westConf[10], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[21].getTeamName() + "\n");
		
		System.out.println("Seed 7 " + westConf[6].getTeamName() + " VS Seed 10 " + westConf[9].getTeamName());
		roundOneWinners[22] = pg.newPlay(westConf[6], westConf[9], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[22].getTeamName() + "\n");
		
		System.out.println("Seed 8 " + westConf[7].getTeamName() + " VS Seed 9 " + westConf[8].getTeamName());
		roundOneWinners[23] = pg.newPlay(westConf[7], westConf[8], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[23].getTeamName() + "\n");
		
		
		System.out.println("\n\nSOUTH DIVISION\n\n");

		System.out.println("Seed 1 " + southConf[0].getTeamName() + " VS Seed 16 " + southConf[15].getTeamName());
		roundOneWinners[24] = pg.newPlay(southConf[0], southConf[15], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[24].getTeamName() + "\n");
		
		System.out.println("Seed 2 " + southConf[1].getTeamName() + " VS Seed 15 " + southConf[14].getTeamName());
		roundOneWinners[25] = pg.newPlay(southConf[1], southConf[14], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[25].getTeamName() + "\n");
		
		System.out.println("Seed 3 " + southConf[2].getTeamName() + " VS Seed 14 " + southConf[13].getTeamName());
		roundOneWinners[26] = pg.newPlay(southConf[2], southConf[13], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[26].getTeamName() + "\n");
		
		System.out.println("Seed 4 " + southConf[3].getTeamName() + " VS Seed 13 " + southConf[12].getTeamName());
		roundOneWinners[27] = pg.newPlay(southConf[3], southConf[12], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[27].getTeamName() + "\n");
		
		System.out.println("Seed 5 " + southConf[4].getTeamName() + " VS Seed 12 " + southConf[11].getTeamName());
		roundOneWinners[28] = pg.newPlay(southConf[4], southConf[11], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[28].getTeamName() + "\n");
		
		System.out.println("Seed 6 " + southConf[5].getTeamName() + " VS Seed 11 " + southConf[10].getTeamName());
		roundOneWinners[29] = pg.newPlay(southConf[5], southConf[10], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[29].getTeamName() + "\n");
		
		System.out.println("Seed 7 " + southConf[6].getTeamName() + " VS Seed 10 " + southConf[9].getTeamName());
		roundOneWinners[30] = pg.newPlay(southConf[6], southConf[9], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[30].getTeamName() + "\n");
		
		System.out.println("Seed 8 " + southConf[7].getTeamName() + " VS Seed 9 " + southConf[8].getTeamName());
		roundOneWinners[31] = pg.newPlay(southConf[7], southConf[8], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundOneWinners[31].getTeamName() + "\n");
		
		roundTwo();
		
	}
	
	public void roundTwo()
	{
		System.out.println("ROUND 2");
		System.out.println("-------------");
		
		System.out.println("EAST DIVISION\n\n");

		System.out.println(roundOneWinners[0].getTeamName() + " VS " + roundOneWinners[7].getTeamName());
		roundTwoWinners[0] = pg.newPlay(roundOneWinners[0], roundOneWinners[7], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[0].getTeamName() + "\n");
		
		System.out.println(roundOneWinners[1].getTeamName() + " VS " + roundOneWinners[6].getTeamName());
		roundTwoWinners[1] = pg.newPlay(roundOneWinners[1], roundOneWinners[6], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[1].getTeamName() + "\n");
		
		System.out.println(roundOneWinners[2].getTeamName() + " VS " + roundOneWinners[5].getTeamName());
		roundTwoWinners[2] = pg.newPlay(roundOneWinners[2], roundOneWinners[5], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[2].getTeamName() + "\n");
	
		System.out.println(roundOneWinners[3].getTeamName() + " VS " + roundOneWinners[4].getTeamName());
		roundTwoWinners[3] = pg.newPlay(roundOneWinners[3], roundOneWinners[4], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[3].getTeamName() + "\n");
		
		
		System.out.println("\n\nMIDWEST DIVISION\n\n");

		System.out.println(roundOneWinners[8].getTeamName() + " VS " + roundOneWinners[15].getTeamName());
		roundTwoWinners[4] = pg.newPlay(roundOneWinners[8], roundOneWinners[15], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[4].getTeamName() + "\n");
		
		System.out.println(roundOneWinners[9].getTeamName() + " VS " + roundOneWinners[14].getTeamName());
		roundTwoWinners[5] = pg.newPlay(roundOneWinners[9], roundOneWinners[14], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[5].getTeamName() + "\n");
		
		System.out.println(roundOneWinners[10].getTeamName() + " VS " + roundOneWinners[13].getTeamName());
		roundTwoWinners[6] = pg.newPlay(roundOneWinners[10], roundOneWinners[13], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[6].getTeamName() + "\n");
	
		System.out.println(roundOneWinners[11].getTeamName() + " VS " + roundOneWinners[12].getTeamName());
		roundTwoWinners[7] = pg.newPlay(roundOneWinners[11], roundOneWinners[12], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[7].getTeamName() + "\n");
		
		
		System.out.println("\n\nWEST DIVISION\n\n");

		System.out.println(roundOneWinners[16].getTeamName() + " VS " + roundOneWinners[23].getTeamName());
		roundTwoWinners[8] = pg.newPlay(roundOneWinners[16], roundOneWinners[23], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[8].getTeamName() + "\n");
		
		System.out.println(roundOneWinners[17].getTeamName() + " VS " + roundOneWinners[22].getTeamName());
		roundTwoWinners[9] = pg.newPlay(roundOneWinners[17], roundOneWinners[22], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[9].getTeamName() + "\n");
		
		System.out.println(roundOneWinners[18].getTeamName() + " VS " + roundOneWinners[21].getTeamName());
		roundTwoWinners[10] = pg.newPlay(roundOneWinners[18], roundOneWinners[21], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[10].getTeamName() + "\n");
	
		System.out.println(roundOneWinners[19].getTeamName() + " VS " + roundOneWinners[20].getTeamName());
		roundTwoWinners[11] = pg.newPlay(roundOneWinners[19], roundOneWinners[20], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[11].getTeamName() + "\n");
		
		
		System.out.println("\n\n SOUTH DIVISION\n\n");

		System.out.println(roundOneWinners[24].getTeamName() + " VS " + roundOneWinners[31].getTeamName());
		roundTwoWinners[12] = pg.newPlay(roundOneWinners[24], roundOneWinners[31], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[12].getTeamName() + "\n");
		
		System.out.println(roundOneWinners[25].getTeamName() + " VS " + roundOneWinners[30].getTeamName());
		roundTwoWinners[13] = pg.newPlay(roundOneWinners[25], roundOneWinners[30], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[13].getTeamName() + "\n");
		
		System.out.println(roundOneWinners[26].getTeamName() + " VS " + roundOneWinners[29].getTeamName());
		roundTwoWinners[14] = pg.newPlay(roundOneWinners[26], roundOneWinners[29], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[14].getTeamName() + "\n");
	
		System.out.println(roundOneWinners[27].getTeamName() + " VS " + roundOneWinners[28].getTeamName());
		roundTwoWinners[15] = pg.newPlay(roundOneWinners[27], roundOneWinners[28], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundTwoWinners[15].getTeamName() + "\n");
		
		
		roundThree();
		
	}
	
	public void roundThree()
	{
		
		System.out.println("ROUND 3");
		System.out.println("-------------");
		
		System.out.println("EAST DIVISION\n\n");

		System.out.println(roundTwoWinners[0].getTeamName() + " VS " + roundTwoWinners[3].getTeamName());
		roundThreeWinners[0] = pg.newPlay(roundTwoWinners[0], roundTwoWinners[3], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundThreeWinners[0].getTeamName() + "\n");
		
		System.out.println(roundTwoWinners[1].getTeamName() + " VS " + roundTwoWinners[2].getTeamName());
		roundThreeWinners[1] = pg.newPlay(roundTwoWinners[1], roundTwoWinners[2], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundThreeWinners[1].getTeamName() + "\n");
		
		
		System.out.println("\n\n MIDWEST DIVISION\n\n");

		System.out.println(roundTwoWinners[4].getTeamName() + " VS " + roundTwoWinners[7].getTeamName());
		roundThreeWinners[2] = pg.newPlay(roundTwoWinners[4], roundTwoWinners[7], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundThreeWinners[2].getTeamName() + "\n");
		
		System.out.println(roundTwoWinners[5].getTeamName() + " VS " + roundTwoWinners[6].getTeamName());
		roundThreeWinners[3] = pg.newPlay(roundTwoWinners[5], roundTwoWinners[6], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundThreeWinners[3].getTeamName() + "\n");
		
		
		System.out.println("\n\n WEST DIVISION\n\n");

		System.out.println(roundTwoWinners[8].getTeamName() + " VS " + roundTwoWinners[11].getTeamName());
		roundThreeWinners[4] = pg.newPlay(roundTwoWinners[8], roundTwoWinners[11], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundThreeWinners[4].getTeamName() + "\n");
		
		System.out.println(roundTwoWinners[9].getTeamName() + " VS " + roundTwoWinners[10].getTeamName());
		roundThreeWinners[5] = pg.newPlay(roundTwoWinners[9], roundTwoWinners[10], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundThreeWinners[5].getTeamName() + "\n");
		
		
		System.out.println("\n\n SOUTH DIVISION\n\n");

		System.out.println(roundTwoWinners[12].getTeamName() + " VS " + roundTwoWinners[15].getTeamName());
		roundThreeWinners[6] = pg.newPlay(roundTwoWinners[12], roundTwoWinners[15], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundThreeWinners[6].getTeamName() + "\n");
		
		System.out.println(roundTwoWinners[13].getTeamName() + " VS " + roundTwoWinners[14].getTeamName());
		roundThreeWinners[7] = pg.newPlay(roundTwoWinners[13], roundTwoWinners[14], homeWins,awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundThreeWinners[7].getTeamName() + "\n");
		
		
		roundFour(); 
	}
	
	public void roundFour()
	{
		System.out.println("ROUND 4");
		System.out.println("-------------");
		
		System.out.println("EAST DIVISION FINALS \n\n");

		System.out.println(roundThreeWinners[0].getTeamName() + " VS " + roundThreeWinners[1].getTeamName());
		roundFourWinners[0] = pg.newPlay(roundThreeWinners[0], roundThreeWinners[1], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundFourWinners[0].getTeamName() + "\n");
				
		
		System.out.println("\n\n MIDWEST DIVISION FINALS \n\n");

		System.out.println(roundThreeWinners[2].getTeamName() + " VS " + roundThreeWinners[3].getTeamName());
		roundFourWinners[1] = pg.newPlay(roundThreeWinners[2], roundThreeWinners[3], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundFourWinners[1].getTeamName() + "\n");
		
		
		System.out.println("\n\n WEST DIVISION FINALS \n\n");

		System.out.println(roundThreeWinners[4].getTeamName() + " VS " + roundThreeWinners[5].getTeamName());
		roundFourWinners[2] = pg.newPlay(roundThreeWinners[4], roundThreeWinners[5], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundFourWinners[2].getTeamName() + "\n");
		
		
		
		System.out.println("\n\n SOUTH DIVISION FINALS \n\n");

		System.out.println(roundThreeWinners[6].getTeamName() + " VS " + roundThreeWinners[7].getTeamName());
		roundFourWinners[3] = pg.newPlay(roundThreeWinners[6], roundThreeWinners[7], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundFourWinners[3].getTeamName() + "\n");
		

		roundFive();
	}
	
	public void roundFive()
	{
		
		System.out.println("ROUND 5");
		System.out.println("-------------");
		

		System.out.println(roundFourWinners[0].getTeamName() + " VS " + roundFourWinners[3].getTeamName());
		roundFiveWinners[0] = pg.newPlay(roundFourWinners[0], roundFourWinners[3], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundFiveWinners[0].getTeamName() + "\n");
				
		

		System.out.println(roundFourWinners[1].getTeamName() + " VS " + roundFourWinners[2].getTeamName());
		roundFiveWinners[1] = pg.newPlay(roundFourWinners[1], roundFourWinners[2], homeWins, awayWins, homeWins + awayWins);
		System.out.println("Winner! :" + roundFiveWinners[1].getTeamName() + "\n");
		
		finals();
		
	}
	
	public void finals()
	{
		System.out.println("2015 NCAA MARCH MADNESS FINALS");
		System.out.println("----------------------");
		
		System.out.println(roundFiveWinners[1].getTeamName() + " VS " + roundFiveWinners[0].getTeamName());
		Champion = pg.newPlay(roundFiveWinners[1], roundFiveWinners[0], homeWins, awayWins, homeWins + awayWins);
		
		System.out.println("WINNER OF THE 2015 TOURNAMENT");
		System.out.println(Champion.getTeamName());

	}
}
