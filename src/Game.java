
public class Game 
{
	private Team t1;
	private Team t2;
	
	//Wining Team Statistics
	private int wTeam;
	private double wScore;
	private double wOR;
	private double wDR;
	private double wAst;
	private double wTO;
	private double wStl;
	private double wBlk;
	
	//Losing Team Statistics
	private int lTeam;
	private double lScore;
	private double lOR;
	private double lDR;
	private double lAst;
	private double lTO;
	private double lStl;
	private double lBlk;
	
	
	public Game()
	{
		
	}
	
	public void setWinStats(int team, double score, double or, double dr, double ast, double to, double stl, double blk)
	{
		wTeam = team;
		wScore = score;
		wOR = or;
		wDR = dr;
		wAst = ast;
		wTO = to;
		wStl = stl;
		wBlk = blk;
		
	}
	
	public void setLossStats(int team, double score, double or, double dr, double ast, double to, double stl, double blk)
	{
		lTeam = team;
		lScore = score;
		lOR = or;
		lDR = dr;
		lAst = ast;
		lTO = to;
		lStl = stl;
		lBlk = blk;
		
	}
	
	public int getWinID() { return wTeam;}
	public double getWinPoints() { return wScore;}
	public double getWinOR() { return wOR;}
	public double getWinDR() { return wDR;}
	public double getWinAST() { return wAst;}
	public double getWinTO() { return wTO;}
	public double getWinSTL() { return wStl;}
	public double getWinBLK() { return wBlk;}
	
	public int getLossID() { return lTeam;}
	public double getLossPoints() { return lScore;}
	public double getLossOR() { return lOR;}
	public double getLossDR() { return lDR;}
	public double getLossAST() { return lAst;}
	public double getLossTO() { return lTO;}
	public double getLossSTL() { return lStl;}
	public double getLossBLK() { return lBlk;}
	
}
