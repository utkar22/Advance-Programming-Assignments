package assignment1;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {
	
	static int hospital_counter = 100001;
	
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList <Slot> list_of_slots = new ArrayList<Slot>();
	static ArrayList <Hospital> list_of_hospitals = new ArrayList<Hospital>();
	static ArrayList <Citizen> list_of_citizens = new ArrayList<Citizen>();
	static ArrayList <Vaccine> list_of_vaccines = new ArrayList<Vaccine>();
	
	static ArrayList <Long> list_of_citizen_ids = new ArrayList<Long>();
	static ArrayList <String> list_of_vaccine_names = new ArrayList<String>();
	static ArrayList <String> list_of_hospital_names = new ArrayList<String>();
	
	static Hospital find_hospital(int id){
		for (int i = 0; i<list_of_hospitals.size(); i++) {
			Hospital hospital = list_of_hospitals.get(i);
			if (hospital.get_id() == id) {
				return hospital;
			}
		}
		return null;
	}
			
	
	static void add_vaccine() {
		try {
			System.out.println("Vaccine Name: ");
			String vax_name = sc.next();
			System.out.println("Number of Doses: ");
			int no_of_doses = sc.nextInt();
			System.out.println("Gap between Doses: ");
			int gap = sc.nextInt();
			
			Vaccine vax = new Vaccine();
			
			if (vax.set_name(vax_name, list_of_vaccine_names)) {
				if (vax.set_doses(no_of_doses)&&vax.set_gap(gap)) {
					list_of_vaccines.add(vax);
					System.out.println("Vaccine name: "+vax_name+", Number of Doses: "+no_of_doses+", Gap Between Doses: "+gap);
					list_of_vaccine_names.add(vax_name);
				}
				else {
					System.out.println("The Number of doses and the gap between them need to be positive integers.");
				}
			}
			else {
				System.out.println("A vaccine with name "+vax_name+" already exists");
			}
		}
		catch (Exception e){
			System.out.println("Error in inputs");
		}
		finally {
		}
	}
	
	static void register_hospital() {
		try {
			System.out.println("Hospital Name: ");
			String hosp_name = sc.next();
			System.out.println("Pincode: ");
			int pin = sc.nextInt();
			
			Hospital hospital = new Hospital();
			
			if (hospital.set_name(hosp_name, list_of_hospital_names)){
				if (hospital.set_pincode(pin)) {
					list_of_hospitals.add(hospital);
					hospital.set_id(hospital_counter);
					System.out.println("Hospital Name: "+hosp_name+", PinCode: "+pin+", Unique ID: "+hospital_counter);
					hospital_counter++;
					list_of_hospital_names.add(hosp_name);
				}
				else {
					System.out.println("The pincode needs to be a 6 digit number.");
				}
			}
			else{
				System.out.println("A hospital with name "+hosp_name+" already exists");
			}
		}
		catch (Exception e){
			System.out.println("Error in inputs");
		}
		finally {
		}
	}

	static void register_citizen() {
		try {
			System.out.println("Citizen Name: ");
			String citizen_name = sc.next();
			System.out.println("Age: ");
			int age = sc.nextInt();
			System.out.println("Unique ID: ");
			long id = sc.nextLong();
			
			Citizen citizen = new Citizen(citizen_name);
			
			if (citizen.set_age(age)){
				if (citizen.set_id(id, list_of_citizen_ids)){
					list_of_citizens.add(citizen);
					list_of_citizen_ids.add(id);
				}
			}
			else {
				System.out.println("Only above 18 are allowed");
			}
		}
		catch (Exception e){
			System.out.println("Error in inputs");
		}
		finally {
		}
	}
	
	static void create_slots() {
		System.out.println("Enter Hospital ID: ");
		int hosp_id = sc.nextInt();
		
		Hospital hospital = find_hospital(hosp_id);
		
		if (hospital==null) {
			System.out.println("Invalid Hospital name.");
			return;
		}
		
		System.out.println("Enter number of Slots to be added: ");
		
	}
	
	static void book_slot() {
		
	}
	
	static void slot_availability() {
		
	}
	
	static void check_status() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CoWin Portal initialized....");
		while (true) {
			System.out.println("---------------------------------");
			System.out.println("1. Add Vaccine");
			System.out.println("2. Register Hospital");
			System.out.println("3. Register Citizen");
			System.out.println("4. Add Slot for Vaccination");
			System.out.println("5. Book Slot for Vaccination");
			System.out.println("6. List all slots for a hospital");
			System.out.println("7. Check Vaccination Status");
			System.out.println("8. Exit");
			System.out.println("---------------------------------");
			int command = sc.nextInt();
			
			if (command==1) {
				add_vaccine();
			}
			else if (command==2) {
				register_hospital();
			}
			else if (command==3) {
				register_citizen();
			}
			else if (command==4) {
				create_slots();
			}
			else if (command==5) {
				book_slot();
			}
			else if (command==6) {
				slot_availability();
			}
			else if (command==7) {
				check_status();
			}
			else {
				break;
			}
			
			
			
		}
		
		System.out.println("Exiting.");
		
		

	}

}
