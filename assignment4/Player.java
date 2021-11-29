package assignment4;
import java.util.*;
import java.lang.Math;

public class Player {
	static String[] arr1 = {"wegf","jefe","hdjd","wjbs","wehd"};
	static String[] arr2 = {"jwdf","iehr","kwjf","jsdb","jwef"};
	static Scanner sc = new Scanner(System.in);
	static Scanner sc_i = new Scanner(System.in);
	
	private ArrayList<Toy> bucket;
	private int chances_left;
	
	Player(){
		this.bucket = new ArrayList<Toy>();
		this.chances_left = 5;
	}
	
	public int get_chances_left() {
		return this.chances_left;
	}
	
	public void display_bucket() {
		System.out.println("Toys won by you are: ");
		for (int i = 0; i<this.bucket.size(); i++) {
			System.out.println(this.bucket.get(i).get_name());
		}
	}
	
	public void decrease_chances() {
		if (this.chances_left>0) {
			this.chances_left--;
		}
	}
	
	public void win_toy(Tile tile){
		Toy toy = tile.get_toy();
		System.out.println("You won a "+toy.get_name()+" toy");
		bucket.add(toy);
	}
	
	public void land_at_tile(Tile tile){
		int flag = 0;
		
		System.out.println("You landed on tile "+tile.get_position());
		if (tile.if_even()) {
			this.win_toy(tile);
		}
		else {
			System.out.println("Question answer round. Integer or strings?");
			
			String t = null;
			
			while (flag==0) {
				try {
					t = sc.next().toLowerCase();
					if (!(t.equals("integer")||t.equals("string"))) {
						throw new InvalidQuestionOptionException("You can only choose between 'integer' or 'string'");
					}
					flag = 1;
				}
				catch (InvalidQuestionOptionException ex) {
					System.out.println("You can only choose between 'integer' or 'string'");
				}
				finally {
					
				}
			}
			
			if (t.equals("integer")) {
				Calculator<Integer> calc = new Calculator<Integer>((int)(Math.random()*200), (int)(Math.random()*50)+1);
				int x = 0;
				flag = 0;
				while (flag==0) {
					try {
						calc.print();
						x = sc_i.nextInt();
						flag = 1;
					}
					catch(Exception e) {
						sc_i.nextLine();
						System.out.println("Invalid input");
					}
					finally {
					}
					
				}
				if (calc.if_correct(x)) {
					this.win_toy(tile);
				}
				else {
					System.out.println("You did not win any toy");
				}
			}
			else if (t.equals("string")) {
				Calculator<String> calc = new Calculator<String>(arr1[5-this.chances_left],arr2[5-this.chances_left]);
				calc.print();
				String x = sc.next();
				if (calc.if_correct(x)) {
					this.win_toy(tile);
				}
				else {
					System.out.println("You did not win any toy");
				}
			}
		}
	}
	
	public void fall_into_mud() {
		System.out.println("You are too energetic and zoomed past all the tiles. Muddy Puddle Splash!");
	}
}
