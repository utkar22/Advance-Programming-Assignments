package assignment3;

public class Cobra extends Snake{
	Cobra(){
		this.set_points(-4);
		this.set_new_level(3);
	}
	
	@Override
	public void display(Player player) {
		System.out.println(player.get_name()+" has reached a Cobra floor");
	}
}
