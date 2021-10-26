package assignment1;

import java.util.*;

public class Citizen {
	private String name;
	private int age;
	private long id;
	
	private int times_vaccinated;
	private int last_vaccinated;
	
	private Slot previous_slot;
	private Slot next_slot;
	
	private boolean if_fully_vaccinated = false;
	
	Citizen(String name){
		this.name = name;
	}
	
	boolean set_age(int age){
		if (age>=18){
			this.age = age;
			return true;
		}
		return false;
	}
	
	boolean set_id(long id, ArrayList<Long> list_of_citizen_ids){
		long lower_lim = (long) Math.pow(10,12);
		long upper_lim = (long) Math.pow(10,13);
		
		if (lower_lim<=id&&id<upper_lim){
			if (!list_of_citizen_ids.contains(id)){
				this.id = id;
				return true;
			}
		}
		return false;
	}
	
	String get_name(){
		return (this.name);
	}
	int get_age(){
		return (this.age);
	}
	long get_id(){
		return (this.id);
	}
}
