package assignment3;

public class Player {
	private final String name;
	private int points;
	private int position;
	
	Player(String name){
		this.name = name;
		this.points = 0;
		this.position = 0;
	}
	
	public String get_name(){
		return this.name;
	}
	
	public void set_points(int points){
		this.points = points;
	}
	
	public int get_points() {
		return this.points;
	}
	
	public void update_points(int new_points) {
		this.points+=new_points;
	}
	
	public void print_points() {
		System.out.println("Total points "+this.points);
	}
	
	public void set_position(int position) {
		if (this.position<=13) {
			this.position = position;
		}
		else {
			this.position = 13;
		}
	}
	
	public int get_position() {
		return this.position;
	}
	
	public void update_position(int value) {
		this.position += value;
		if (this.position>13){
			this.position = 13;
		}
	}
	
	public void print_position() {
		System.out.println("Player position Floor-"+this.position);
	}
	
	public boolean if_win() {
		if (this.position==13) {
			return true;
		}
		return false;
	}
	
	public void final_points() {
		System.out.println(this.name+" accumulated "+this.points+" points");
	}
}
