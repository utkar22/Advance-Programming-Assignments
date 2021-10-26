package assignment3;

import java.util.Random;

public class Dice {
	private final int no_of_faces;
	private int curr_face;
	
	private Random rand = new Random();
	
	Dice(int no_of_faces){
		this.no_of_faces = no_of_faces;
		this.roll();
	}
	
	public int get_curr_face() {
		return this.curr_face;
	}
	
	public int roll(){
		this.curr_face = rand.nextInt(no_of_faces) + 1;
		return curr_face;
	}
	
	
}
