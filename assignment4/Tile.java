package assignment4;

public class Tile {
	private final int position;
	private final Toy toy;
	
	Tile(int position, Toy toy){
		this.position = position;
		this.toy = toy;
	}
	
	public int get_position() {
		return this.position;
	}
	
	public Toy get_toy(){
		Toy newToy;
		try {
			newToy = (Toy) this.toy.clone();
		}
		catch (CloneNotSupportedException e) {
			//Ideally, this will never be reached
			newToy = null;
		}
		finally {		
		}
		return newToy;
	}
	
	public boolean if_even() {
		if (position%2==0) {
			return true;
		}
		return false;
	}

}
