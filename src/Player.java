import java.awt.Color;


public class Player {
	private String name;
	private int playerPosn;
	private int playerScore;
	private Color playerColor;
	
	public Player(int no){
	    name = "Player " + no;
	    playerPosn = 0;
	}
	
	public int returnPosition(){
		return playerPosn;
	}
	

	public String returnName(){
		return name;
	}
	
	public void setPosition(int posn){
		playerPosn = posn;
	}
	
	public void incPosition(int posn){
		playerPosn += posn;
	}
	
	public void setPlayerColor(Color c){
		playerColor = c;
	}
	
	public Color returnPlayerColor(){
		return playerColor;
	}
	
	public void incPlayerScore(int a){
		playerScore += a;
	}
	
	public int returnPlayerScore(){
		return playerScore;
	}

}
