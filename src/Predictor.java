
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Predictor 
{
	private static int numTeams = 365;
	private static Team[]  teams = new Team[numTeams]; 
	
	private static int numGames = 5354;
	private static Game[] games = new Game[numGames];
	
	private static Team[] playoffTeams = new Team[64];
	
	private static Team[] midWestConf = new Team[16];
	private static Team[] westConf = new Team[16];
	private static Team[] eastConf = new Team[16];
	private static Team[] southConf = new Team[16];
	
	
	private static int homeWins = 0; 
	private static int awayWins = 0;
	
	
	public static void createTeams()
	{
		String csvFile = "teams-1.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		Team currTeam;
		int i = 0;
		
		try 
		{		 
			br = new BufferedReader(new FileReader(csvFile));
			line = br.readLine();
			while ((line = br.readLine()) != null) 
			{
	 
			        // use comma as separator
				String[] team = line.split(cvsSplitBy);				
				String teamName = team[1];
				int teamID = Integer.parseInt(team[0]);
				currTeam = new Team(teamName, teamID);
				teams[i] = currTeam;
				i++;
			}	 
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void createGames()
	{
		String csvFile = "regular_season_detailed_results_2015-1.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		Game currGame;
		int i = 0;
		
		try 
		{		 
			br = new BufferedReader(new FileReader(csvFile));
			line = br.readLine();
			while ((line = br.readLine()) != null) 
			{	
		        // use comma as separator
				String[] game = line.split(cvsSplitBy);	
				
				
				//Get amount of home wins 
				if(game[6].equals("H"))
					homeWins++;
				else
					awayWins++;
				
			
				//Wining Teams	
				int wTeam = Integer.parseInt(game[2]);
				double wScore = Double.valueOf(game[3]) ;
				double wOR = Double.valueOf(game[14]);
				double wDR = Double.valueOf(game[15]);
				double wAst = Double.valueOf(game[16]);
				double wTO = Double.valueOf(game[17]);
				double wStl = Double.valueOf(game[18]);
				double wBlk = Double.valueOf(game[19]);
				
				//Losing Team
				int lTeam = Integer.parseInt(game[4]);
				double lScore = Double.valueOf(game[5]);
				double lOR = Double.valueOf(game[27]);
				double lDR = Double.valueOf(game[28]);
				double lAst = Double.valueOf(game[29]);
				double lTO = Double.valueOf(game[30]);
				double lStl = Double.valueOf(game[31]);
				double lBlk = Double.valueOf(game[32]);
				
				currGame = new Game();
				currGame.setWinStats(wTeam, wScore, wOR, wDR, wAst, wTO, wStl, wBlk);
				currGame.setLossStats(lTeam, lScore, lOR, lDR, lAst, lTO, lStl, lBlk);
				games[i] = currGame;
				i++;
			}	 
			//System.out.println(homeWins);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void createTeamAverages()
	{
		double points = 0;
		double pointsAllowed = 0;
		double OR = 0;
		double DR = 0;
		double Ast = 0;
		double TO = 0;
		double Stl = 0;
		double Blk = 0;
		
		int teamID;
		int winID;
		int lossID;
		int gameCount = 0; 
		
		for(int i = 0; i < teams.length - 1 ; i++)
		{	
			
			teamID = teams[i].getTeamID();
			
				
			
			for(int j = 0; j < games.length; j++)
			{
				winID = games[j].getWinID();
				lossID = games[j].getLossID();
				
				if(winID == teamID)
				{
					gameCount++;
					points += games[j].getWinPoints();
					pointsAllowed += games[j].getLossPoints();
					OR += games[j].getWinOR();
					DR += games[j].getWinDR();
					Ast += games[j].getWinAST();
					TO += games[j].getWinTO();
					Stl += games[j].getWinSTL();
					Blk += games[j].getWinBLK();
				}
				
				if(lossID == teamID)
				{
					gameCount++;
					points += games[j].getLossPoints();
					pointsAllowed += games[j].getWinPoints();
					OR += games[j].getLossOR();
					DR += games[j].getLossDR();
					Ast += games[j].getLossAST();
					TO += games[j].getLossTO();
					Stl += games[j].getLossSTL();
					Blk += games[j].getLossBLK();
				}	
			}

				points /= gameCount; 
				pointsAllowed /= gameCount;
				OR /= gameCount;
				DR /= gameCount;
				Ast /= gameCount;
				TO /= gameCount;
				Stl /= gameCount;
				Blk /= gameCount;
				teams[i].setTeamStats(points, pointsAllowed, OR, DR, Ast, Stl,Blk, TO);
				
				//System.out.println("GC " + gameCount + " Points " + points + " Points Allowed " + pointsAllowed + " OR " + OR +
					//" DR " + DR + " Ast " + Ast + " TO " + TO + " Stl " + Stl + " Blk " + Blk);
				
				
				gameCount = 0; 
				points = 0; 
				pointsAllowed = 0;
				OR = 0;
				DR = 0;
				Ast = 0;
				TO = 0;
				Stl = 0;
				Blk = 0;
		}	
	}
	
	public static void createConf()
	{
		midWestConf[0] = teams[1246 - 1101];
		midWestConf[1] = teams[1242 - 1101];
		midWestConf[2] = teams[1323 - 1101];
		midWestConf[3] = teams[1268 - 1101];
		midWestConf[4] = teams[1452 - 1101];
		midWestConf[5] = teams[1139 - 1101]; 
		midWestConf[6] = teams[1455 - 1101]; 
		midWestConf[7] = teams[1153 - 1101]; 
		midWestConf[8] = teams[1345 - 1101]; 
		midWestConf[9] = teams[1231 - 1101];
		midWestConf[10] = teams[1400 - 1101];
		midWestConf[11] = teams[1138 - 1101];
		midWestConf[12] = teams[1434 - 1101];
		midWestConf[13] = teams[1318 - 1101]; 
		midWestConf[14] = teams[1308 - 1101];
		midWestConf[15] = teams[1214 - 1101];
		
		westConf[0] = teams[1458 - 1101];
		westConf[1] = teams[1112 - 1101];
		westConf[2] = teams[1124 - 1101];
		westConf[3] = teams[1314 - 1101];
		westConf[4] = teams[1116 - 1101];
		westConf[5] = teams[1462 - 1101]; 
		westConf[6] = teams[1433 - 1101]; 
		westConf[7] = teams[1332 - 1101]; 
		westConf[8] = teams[1329 - 1101]; 
		westConf[9] = teams[1326 - 1101];
		westConf[10] = teams[1279 - 1101];
		westConf[11] = teams[1459 - 1101];
		westConf[12] = teams[1217 - 1101];
		westConf[13] = teams[1209 - 1101]; 
		westConf[14] = teams[1411 - 1101];
		westConf[15] = teams[1157 - 1101];
		
		eastConf[0] = teams[1437 - 1101];
		eastConf[1] = teams[1438 - 1101];
		eastConf[2] = teams[1328 - 1101];
		eastConf[3] = teams[1257 - 1101];
		eastConf[4] = teams[1320 - 1101];
		eastConf[5] = teams[1344 - 1101]; 
		eastConf[6] = teams[1277 - 1101]; 
		eastConf[7] = teams[1301 - 1101]; 
		eastConf[8] = teams[1261 - 1101]; 
		eastConf[9] = teams[1208 - 1101];
		eastConf[10] = teams[1173 - 1101];
		eastConf[11] = teams[1461 - 1101];
		eastConf[12] = teams[1414 - 1101];
		eastConf[13] = teams[1107 - 1101]; 
		eastConf[14] = teams[1125 - 1101];
		eastConf[15] = teams[1248 - 1101];
		
		southConf[0] = teams[1181 - 1101];
		southConf[1] = teams[1211 - 1101];
		southConf[2] = teams[1235 - 1101];
		southConf[3] = teams[1207 - 1101];
		southConf[4] = teams[1428 - 1101];
		southConf[5] = teams[1374 - 1101]; 
		southConf[6] = teams[1234 - 1101]; 
		southConf[7] = teams[1361 - 1101]; 
		southConf[8] = teams[1385 - 1101]; 
		southConf[9] = teams[1172 - 1101];
		southConf[10] = teams[1417 - 1101];
		southConf[11] = teams[1372 - 1101];
		southConf[12] = teams[1186 - 1101];
		southConf[13] = teams[1412 - 1101]; 
		southConf[14] = teams[1315 - 1101];
		southConf[15] = teams[1352 - 1101];
		
		
		
		
		
		
		
		
		playoffTeams[0] = teams[1246 - 1101];
		playoffTeams[1] = teams[1242 - 1101];
		playoffTeams[2] = teams[1323 - 1101];
		playoffTeams[3] = teams[1268 - 1101];
		playoffTeams[4] = teams[1452 - 1101];
		playoffTeams[5] = teams[1139 - 1101]; 
		playoffTeams[6] = teams[1455 - 1101]; 
		playoffTeams[7] = teams[1153 - 1101]; 
		playoffTeams[8] = teams[1345 - 1101]; 
		playoffTeams[9] = teams[1231 - 1101];
		playoffTeams[10] = teams[1400 - 1101];
		playoffTeams[11] = teams[1138 - 1101];
		playoffTeams[12] = teams[1434 - 1101];
		playoffTeams[13] = teams[1318 - 1101]; 
		playoffTeams[14] = teams[1308 - 1101];
		playoffTeams[15] = teams[1214 - 1101];	
		playoffTeams[16] = teams[1458 - 1101];
		playoffTeams[17] = teams[1112 - 1101];
		playoffTeams[18] = teams[1124 - 1101];
		playoffTeams[19] = teams[1314 - 1101];
		playoffTeams[20] = teams[1116 - 1101];
		playoffTeams[21] = teams[1462 - 1101]; 
		playoffTeams[22] = teams[1433 - 1101]; 
		playoffTeams[23] = teams[1332 - 1101]; 
		playoffTeams[24] = teams[1329 - 1101]; 
		playoffTeams[25] = teams[1326 - 1101];
		playoffTeams[26] = teams[1279 - 1101];
		playoffTeams[27] = teams[1459 - 1101];
		playoffTeams[28] = teams[1217 - 1101];
		playoffTeams[29] = teams[1209 - 1101]; 
		playoffTeams[30] = teams[1411 - 1101];
		playoffTeams[31] = teams[1157 - 1101];	
		playoffTeams[32] = teams[1437 - 1101];
		playoffTeams[33] = teams[1438 - 1101];
		playoffTeams[34] = teams[1328 - 1101];
		playoffTeams[35] = teams[1257 - 1101];
		playoffTeams[36] = teams[1320 - 1101];
		playoffTeams[37] = teams[1344 - 1101]; 
		playoffTeams[38] = teams[1277 - 1101]; 
		playoffTeams[39] = teams[1301 - 1101]; 
		playoffTeams[40] = teams[1261 - 1101]; 
		playoffTeams[41] = teams[1208 - 1101];
		playoffTeams[42] = teams[1173 - 1101];
		playoffTeams[43] = teams[1461 - 1101];
		playoffTeams[44] = teams[1414 - 1101];
		playoffTeams[45] = teams[1107 - 1101]; 
		playoffTeams[46] = teams[1125 - 1101];
		playoffTeams[47] = teams[1248 - 1101];		
		playoffTeams[48] = teams[1181 - 1101];
		playoffTeams[49] = teams[1211 - 1101];
		playoffTeams[50] = teams[1235 - 1101];
		playoffTeams[51] = teams[1207 - 1101];
		playoffTeams[52] = teams[1428 - 1101];
		playoffTeams[53] = teams[1374 - 1101]; 
		playoffTeams[54] = teams[1234 - 1101]; 
		playoffTeams[55] = teams[1361 - 1101]; 
		playoffTeams[56] = teams[1385 - 1101]; 
		playoffTeams[57] = teams[1172 - 1101];
		playoffTeams[58] = teams[1417 - 1101];
		playoffTeams[59] = teams[1372 - 1101];
		playoffTeams[60] = teams[1186 - 1101];
		playoffTeams[61] = teams[1412 - 1101]; 
		playoffTeams[62] = teams[1315 - 1101];
		playoffTeams[63] = teams[1352 - 1101];
		

	}
	

	public static void main(String[] args)
	{
		ScaleTeams st = new ScaleTeams();
		NormalizeTeams nt = new NormalizeTeams();
		PlayGame pg = new PlayGame();
		
		
		createTeams();
		createGames();
		createTeamAverages();
		createConf();
		nt.normalize(eastConf);
		nt.normalize(southConf);
		nt.normalize(westConf);
		nt.normalize(midWestConf);
		
		
		//System.out.println(southConf[0].getTeamName() + "   " + westConf[0].getTeamName());
		//pg.newPlay(westConf[0], southConf[0], homeWins,awayWins, homeWins + awayWins);
		
		
		Tournament T = new Tournament(eastConf, southConf, westConf,midWestConf, homeWins, awayWins);
		T.roundOne();
		
		
		
		
		
		
		 /* for(int i = 0; i < 16; i++)
	    {
			
			System.out.println();
			System.out.println(eastConf[i].getTeamName() + "   " + eastConf[i].getTeamPoints() + "   "+ eastConf[i].getTeamAssists() + "   "
					+ eastConf[i].getTeamORB() + "   "+ eastConf[i].getTeamTO() + "   ");
			
			System.out.println(eastConf[i].getTeamName() + "   " + eastConf[i].getPointsNorm() + "   "+ eastConf[i].getAssistsNorm() + "   "
					+ eastConf[i].getORBNorm() + "   "+ eastConf[i].getTONorm() + "   ");
		}  */
		
		
		
		
		
		/* 
		System.out.println("Break");
		
		//Scale Offence Vector
		st.scalePoints(midWestConf);
		st.scaleAssists(midWestConf);
		st.scaleOR(midWestConf);
		st.scaleTO(midWestConf);
		
		System.out.println();
		//Scale Defensive Vector
		st.scalePointsAgainst(midWestConf);
		System.out.println();
		System.out.println();
		st.scaleDR(midWestConf);
		System.out.println();
		System.out.println();
		st.scaleSteals(midWestConf);
		System.out.println();
		System.out.println();
		st.scaleBlocks(midWestConf);
		
		
		System.out.println();
		System.out.println("MIDWEST CONF ");
		
		
		// OFFENCE
		System.out.println("OFFENCE");
		for(int i = 0; i < 16; i++)
	    {
			System.out.println(midWestConf[i].getTeamName() + "   " + midWestConf[i].getPointsRaiting() + "   "+ midWestConf[i].getAssistRaiting() + "   "
					+ midWestConf[i].getORBRaiting() + "   "+ midWestConf[i].getTORaiting() + "   ");
		}
		
		System.out.println();
		System.out.println();
		
		//DEFENSE
		System.out.println("DEFENCE");
		for(int i = 0; i < 16; i++)
	    {
			System.out.println(midWestConf[i].getTeamName() + "   " + midWestConf[i].getPointsAgainstRaiting() + "   "+ midWestConf[i].getDRBRaiting() + "   "
					+ midWestConf[i].getStealsRaiting() + "   "+ midWestConf[i].getBlocksRaiting() + "   ");
		}
		
		
		System.out.println();
		System.out.println();
		pg.play(midWestConf[0],midWestConf[1]);  */
	

		
		/*
		System.out.println("WEST CONF ");
		for(int i = 0; i < 16; i++)
		{
			System.out.println(westConf[i].getTeamName()+ "   " + westConf[i].getTeamPoints());
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("EAST CONF ");
		for(int i = 0; i < 16; i++)
		{
			System.out.println(eastConf[i].getTeamName()+ "   " + eastConf[i].getTeamPoints());
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("SOUTH CONF ");
		for(int i = 0; i < 16; i++)
		{
			System.out.println(southConf[i].getTeamName()+ "   " + southConf[i].getTeamPoints());
		}
		*/
		
	}
	
	
	
	
}
