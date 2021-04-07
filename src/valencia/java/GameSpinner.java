package valencia.java;

public class GameSpinner {
	private int sectors;
	private int run = 1;
	private int last;
	public GameSpinner(int sectors) {
		this.sectors = sectors;
	}
	public int spin() {
		int current = (int) (Math.random() * sectors) + 1;
		if(current == last) {
			run += 1;
		} else  {
			run = 1;
		}
		last = current;
		return current;
	}
	public int currentRun() {
		return run;
	}

}
class Runner {
	public static void main(String[] args) {
		GameSpinner obj = new GameSpinner(4);
		System.out.println(obj.currentRun());
		System.out.println(obj.spin());
		System.out.println(obj.spin());
		System.out.println(obj.spin());
		System.out.println(obj.spin());
		System.out.println(obj.currentRun());
	}
}