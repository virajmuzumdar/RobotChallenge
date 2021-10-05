import java.util.Arrays;

public class Direction {
	private static String[] oFace= {"NORTH", "SOUTH", "EAST", "WEST"};
	private static String[] lFace= {"WEST", "EAST","NORTH", "SOUTH"};
	private static String[] rFace= {"EAST", "WEST","SOUTH", "NORTH"};
	
	private String currDirection;
	public Direction(String d) {
		this.setCurrDirection(d);
	}
	public String getCurrDirection() {
		return currDirection;
	}
	public void setCurrDirection(String currDirection) {
		this.currDirection = currDirection;
	}
	public void turnLeft() {
		int index= Arrays.asList(oFace).indexOf(currDirection);
		this.setCurrDirection(lFace[index]);
	}
	
	public void turnRight() {
		int index= Arrays.asList(oFace).indexOf(currDirection);
		this.setCurrDirection(rFace[index]);
	}
}
