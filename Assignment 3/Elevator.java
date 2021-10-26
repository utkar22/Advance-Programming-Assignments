package assignment3;

public class Elevator extends Ladder{
	Elevator(){
		this.set_points(4);
		this.set_new_level(10);
	}
	
	@Override
	public void display(Player player) {
		System.out.println(player.get_name()+" has reached an Elevator floor");
	}
}
