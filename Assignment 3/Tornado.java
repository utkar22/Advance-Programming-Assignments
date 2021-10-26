package assignment3;

import java.util.Random;

public class Tornado extends Floor{
	private final int points;
	private final int new_level;
	
	private Random rand = new Random();
	
	Tornado(int level){
		super();
		
		int x = rand.nextInt(100);
		if (x>=80) {
			this.new_level= level+2;
			this.points = -2;
		}
		else if(x>=50) {
			this.new_level = level + 1;
			this.points = -1;
		}
		else if (x>=20) {
			this.new_level = level - 1;
			this.points = 1;
		}
		else {
			this.new_level = level - 2;
			this.points = 3;
		}
	}
	
	@Override
	public int get_new_floor() {
		return this.new_level;
	}
	
	@Override
	public void display(Player player) {
		System.out.println(player.get_name()+" has reached a Tornado floor");
	}

	@Override
	public void update_points(Player player) {
		player.update_points(points);		
	}
	
	@Override
	public boolean is_empty(){
		return false;
	}

}
