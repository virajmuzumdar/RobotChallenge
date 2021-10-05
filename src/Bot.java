
public class Bot {
	private int x;
	private int y;
	public Direction d;
	
	public Bot(int x, int y, String d) {
		this.setX(x);
		this.setY(y);
		this.d= new Direction(d);
		System.out.println("Bot placed on ("+ getX()+ ","+ getY()+") position on table");
	}
	
	public void move() {
		if(d.getCurrDirection().equals("NORTH")) {
			setX(x+1);
		}
		if(d.getCurrDirection().equals("SOUTH")) {
			setX(x-1);
		}
		if(d.getCurrDirection().equals("EAST")) {
			setY(y+1);
		}
		if(d.getCurrDirection().equals("WEST")) {
			setY(y-1);
		}
		System.out.println("Bot at ("+ getX()+ ","+ getY()+") position on table");
	}
	
	public void rotateLeft() {
		this.d.turnLeft();
	}
	
	public void rotateRight() {
		this.d.turnRight();
	}
	
	public void report() {
		System.out.println(getX()+ ","+ getY()+ ","+ d.getCurrDirection());
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		//only change direction if bot will still remain on table after change
		if(x>=0 && x<=4) {
			this.x = x;
		}else {
			System.out.println("Error: Bot could not be placed at this position");
		}
	}

	public int getY() {
		return y;
	}
	

	public void setY(int y) {
		//only change direction if bot will still remain on table after change
		if(y>=0 && y<=4) {
			this.y = y;
		}else {
			System.out.println("Error: Bot could not be placed at this position");
		}
	}


}
