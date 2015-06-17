
public class Team 
{
	private String name;
	private int ID;
	private double avgPoints; // points
	private double avgPointsAgainst; // other teams points
	private double avgORB; // offensive rebounds
	private double avgDRB; // defensive rebounds
	private double avgAssists; // assists 
	private double avgSteals; // steals
	private double avgBlocks; // blocks 
	private double avgTO; // turn overs 
	
	// OFFENSIVE VECTOR RAITINGS 
	private double pointsRaiting;
	private double ORBRaiting;
	private double assistRaiting;
	private double TORaiting;
	
	//DEFENSIVE VECTOR RAITINGS
	private double pointsAgainstRaiting;
	private double DRBRaiting;
	private double stealsRaiting;
	private double blocksRaiting;
	
	
	private double normalizedPoints;
	private double normalizedORB;
	private double normalizedAssists;
	private double normalizedTO;
	
	private double normalizedPointsAg;
	private double normalizedDRB;
	private double normalizedSteals;
	private double normalizedBlocks;
	
	
	
	
	
	
	public Team(String teamName, int teamID)
	{
		name = teamName;
		ID = teamID;
	}
	
	public String getTeamName(){ return name;}
	public int getTeamID(){ return ID;}
	public double getTeamPoints(){ return avgPoints;}
	public double getTeamPointsAgainst(){ return avgPointsAgainst;}
	public double getTeamORB(){ return avgORB;}
	public double getTeamDRB(){ return avgDRB;}
	public double getTeamAssists(){ return avgAssists;}
	public double getTeamSteals(){ return avgSteals;}
	public double getTeamBlocks(){ return avgBlocks;}
	public double getTeamTO(){ return avgTO;}
	
	public double getPointsRaiting() { return pointsRaiting;}
	public double getORBRaiting() { return ORBRaiting;}
	public double getAssistRaiting() { return assistRaiting;}
	public double getTORaiting() { return TORaiting;}
	
	public double getPointsAgainstRaiting() { return pointsAgainstRaiting;}
	public double getDRBRaiting() { return DRBRaiting;}
	public double getStealsRaiting() { return stealsRaiting;}
	public double getBlocksRaiting() { return blocksRaiting;}
	
	
	//NORMALIZED 
	public double getPointsNorm() { return normalizedPoints;}
	public double getORBNorm() { return normalizedORB;}
	public double getAssistsNorm() { return normalizedAssists;}
	public double getTONorm() { return normalizedTO;}
	
	public double getPointsAgainstNorm() { return normalizedPointsAg;}
	public double getDRBNorm() { return normalizedDRB;}
	public double getStealsNorm() { return normalizedSteals;}
	public double getBlocksNorm() { return normalizedBlocks;}
	
	
	
	
	public void setTeamStats(double points, double pa, double orb, double drb,double ast, double stl, double blk, double to)
	{
		avgPoints = points;
		avgPointsAgainst = pa;
		avgORB = orb;
		avgDRB = drb;
		avgAssists = ast;
		avgSteals = stl;
		avgBlocks = blk;
		avgTO = to;
	}
	
	public void setTeamStatsNorm(double points, double pa, double orb, double drb,double ast, double stl, double blk, double to)
	{
		normalizedPoints = points;
		normalizedPointsAg = pa;
		normalizedORB = orb;
		normalizedDRB = drb;
		normalizedAssists = ast;
		normalizedSteals = stl;
		normalizedBlocks = blk;
		normalizedTO = to;
	}
	
	
	
	
	//OFFENSIVE VECTOR RAITNGS
	public void setPointsRaiting(double rate) {pointsRaiting = rate;}
	public void setORBRaiting(double rate) {ORBRaiting = rate;}
	public void setAssistRaiting(double rate) {assistRaiting = rate;}
	public void setTORaiting(double rate) {TORaiting = rate;}
	
	//DEFENSIVE VECTOR RAITNGS
	public void setPointsAgainstRaiting(double rate) {pointsAgainstRaiting = rate;}
	public void setDRBRaiting(double rate) {DRBRaiting = rate;}
	public void setStealsRaiting(double rate) {stealsRaiting = rate;}
	public void setBlocksRaiting(double rate) {blocksRaiting = rate;}
	
	

}
