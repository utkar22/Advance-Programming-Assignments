package assignment1;

import java.lang.Math;
import java.util.*;

public class Hospital {
	private String name;
	private int pincode;
	private int id;
	
	//Constructor
	Hospital(){
	}
	
	//Function to set
	boolean set_name(String name, ArrayList<String> list_of_names) {
		if (!list_of_names.contains(name)) {
			this.name = name;
			return true;
		}
		return false;
	}
	
	boolean set_pincode(int pincode) {
		if (100000<=pincode&&pincode<1000000) {
			this.pincode = pincode;
			return true;
		}
		return false;
	}
	
	void set_id(int id){
		this.id = id;
	}
	
	//Functions to get
	String get_name() {
		return (this.name);
	}
	
	int get_id() {
		return (this.id);
	}
	
	int get_pincode() {
		return (this.pincode);
	}

}
