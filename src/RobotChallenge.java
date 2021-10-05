import java.util.Scanner;

public class RobotChallenge{
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		Bot b= null;
		while(true) {
			System.out.println("Enter command:");
			String command= sc.nextLine();
			if(command.split(" |,")[0].equals("PLACE")) {
				b= new Bot(Integer.parseInt(command.split(" |,")[1]),Integer.parseInt(command.split(" |,")[2]), command.split(" |,")[3]);
			}
			if(command.equals("MOVE") && b!= null) {
				System.out.println("Bot moving");
				b.move();
			}
			if(command.equals("LEFT") && b!= null) {
				System.out.println("Rotating");
				b.rotateLeft();
			}
			if(command.equals("RIGHT") && b!= null) {
				System.out.println("Rotating");
				b.rotateRight();
			}
			if(command.equals("REPORT") && b!= null) {
				b.report();
			}
			if(command.equals("EXIT")) {
				sc.close();
				break;
			}
		}
	}
}
