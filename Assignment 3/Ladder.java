package assignment3;

public class Ladder extends Floor{
	private int points;
	private int new_level;
	
	Ladder(){
		super();
		this.points = 2;
		this.new_level = 12;
	}
	
	protected void set_points(int points){
		this.points = points;
	}
	protected void set_new_level(int new_level){
		this.new_level = new_level;
	}

	@Override
	public int get_new_floor() {
		return this.new_level;
	}
	
	@Override
	public void display(Player player) {
		System.out.println(player.get_name()+" has reached a Ladder floor");
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
