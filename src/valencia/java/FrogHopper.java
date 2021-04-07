package valencia.java;

public class FrogHopper {
	private int goalDistance;
	private int maxHops;

	public FrogHopper(int dist, int hops) {
		goalDistance = dist;
		maxHops = hops;
	}

	private int HopDistance() {
		return (int) (Math.random()*30)-10;
	}

	public boolean simulate() {
		int position = 0;
		for(int i = 0; i < maxHops; i++) {
			int jump = HopDistance();
			System.out.println(jump);
			position += jump;
			if(position > goalDistance) {
				return true;
			} else if(position < 0) {
				return false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		FrogHopper obj = new FrogHopper(24,5);
		System.out.println(obj.simulate());
	}
}

