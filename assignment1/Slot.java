package assignment1;

public class Slot {
	private int day;
	private int available;
	Vaccine vaccine;
	
	Slot(int day, int available, Vaccine vaccine){
		this.day = day;
		this.available = available;
		this.vaccine = vaccine;
	}
	
	boolean book_slot(){
		if (this.available>0){
			--this.available;
			return (true);
		}
		return (false);
	}
	
	int get_available(){
		return (this.available);
	}

}
