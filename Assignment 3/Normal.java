package assignment3;

public class Normal extends Floor {
	private final int points;
	private final int level;
	
	Normal(int level){
		this.level = level;
		this.points = 1;
	}

	@Override
	public int get_new_floor() {
		return this.level;
	}

	@Override
	public void display(Player player) {
		System.out.println(player.get_name()+" has reached an Empty floor");
	}

	@Override
	public void update_points(Player player) {
		player.update_points(points);		
	}
	
	@Override
	public boolean is_empty(){
		return true;
	}

}
