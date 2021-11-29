package assignment4;

import java.util.*;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static Player curr_player;
	static ArrayList<Tile> list_of_tiles = new ArrayList<Tile>();
	
	static Scanner sc = new Scanner(System.in);
	static BufferedReader bff = new BufferedReader(new InputStreamReader(System.in));
	
	static String[] number_to_word = {"first","second","third","fourth","fifth"};
	
	static void generate_tiles() {
		list_of_tiles.add(new Tile(1,new Toy("Softie Ball")));
		list_of_tiles.add(new Tile(2,new Toy("Smiley Ball")));
		list_of_tiles.add(new Tile(3,new Toy("Rubber Ball")));
		list_of_tiles.add(new Tile(4,new Toy("Tennis Ball")));
		list_of_tiles.add(new Tile(5,new Toy("Barbie Doll")));
		list_of_tiles.add(new Tile(6,new Toy("Ken Doll")));
		list_of_tiles.add(new Tile(7,new Toy("Mickey Mouse Plushie")));
		list_of_tiles.add(new Tile(8,new Toy("Pikachu Plushie")));
		list_of_tiles.add(new Tile(9,new Toy("Minion Plushie")));
		list_of_tiles.add(new Tile(10,new Toy("Teddy Bear")));
		list_of_tiles.add(new Tile(11,new Toy("Marble")));
		list_of_tiles.add(new Tile(12,new Toy("Crazy Ball")));
		list_of_tiles.add(new Tile(13,new Toy("iPhone")));
		list_of_tiles.add(new Tile(14,new Toy("Bugs Bunny plushie")));
		list_of_tiles.add(new Tile(15,new Toy("Big Chungus plushie")));
		list_of_tiles.add(new Tile(16,new Toy("Caterpillar plushie")));
		list_of_tiles.add(new Tile(17,new Toy("Dog plushie")));
		list_of_tiles.add(new Tile(18,new Toy("Hotwheels")));
		list_of_tiles.add(new Tile(19,new Toy("Beyblade")));
		list_of_tiles.add(new Tile(20,new Toy("Large Teddy Bear")));		
	}
	
	static int roll_dice(){
		return (int)(Math.random()*26);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hit enter to initialize the game");
		bff.readLine();
		
		curr_player = new Player();
		generate_tiles();
		
		System.out.println("Game is ready");
		
		while (curr_player.get_chances_left()!=0){
			System.out.println("Hit enter for your "+number_to_word[5-curr_player.get_chances_left()]+" hop");
			bff.readLine();
			
			int tile_no = roll_dice();
			
			if (tile_no>=20) {
				curr_player.fall_into_mud();
			}
			else {
				curr_player.land_at_tile(list_of_tiles.get(tile_no));
			}
			curr_player.decrease_chances();
		}
		
		System.out.println("Game over");
		curr_player.display_bucket();
	}

}
