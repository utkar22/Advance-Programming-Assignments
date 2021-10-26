package assignment1;

import java.util.*;

public class Vaccine {
	String name;
	int doses;
	int gap;
	
	Vaccine(){
	}
	
	boolean set_name(String name, ArrayList<String> list_of_names) {
		if (!list_of_names.contains(name)) {
			this.name = name;
			return true;
		}
		return false;
	}
	
	boolean set_doses(int doses) {
		if (doses>0) {
			this.doses = doses;
			return true;
		}
		return false;
	}
	
	boolean set_gap(int gap) {
		if (gap>0) {
			this.gap = gap;
			return true;
		}
		return false;
	}
}
