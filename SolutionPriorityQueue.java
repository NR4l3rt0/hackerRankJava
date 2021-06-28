package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SolutionPriorityQueue {

	enum Events { ENTER, SERVED }
	
	private static List<String> groupOfEvents = new ArrayList<>();
	

	static List<Student> getStudents(List<String> events) {
		
		List<Student> groupOfStudents = new LinkedList<>();
		Scanner sc = null;
		
		System.out.println(events);
		for (String event : events) {
			System.out.println(event);
			String[] tmp = event.split("\\s");
			
			String eventType = tmp[0];
			
			if(eventType.equalsIgnoreCase(Events.ENTER.toString())){	
				
				System.out.println("event type?");
				String name =  tmp[1];
				double cgpa = Double.valueOf( tmp[2]);
				int id = Integer.valueOf(tmp[3]);

				// Add a student to the list
				groupOfStudents.add(new Student(id, name, cgpa));

			} else if (eventType.equalsIgnoreCase(Events.SERVED.toString())){
				
				// In case there are students, they are sorted and then the 
				// first one is removed
				System.out.println("boolean " + !groupOfStudents.isEmpty());
				if(!groupOfStudents.isEmpty()) {
					System.out.println("inside");
					Collections.sort(groupOfStudents);
					((LinkedList<Student>) groupOfStudents).pollFirst();
					
				} 
				
			} else {
				System.out.println("Not sure..");
			}
		
		}
		
		return groupOfStudents;
	}
	
	
	public static void main(String[] args) {
		
		int numberOfEvents = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (numberOfEvents <= 1 || numberOfEvents >= 1001) {
			System.out.println("Insert a number of events in range [2,1000]: ");
			numberOfEvents = Integer.parseInt(sc.nextLine());
		}
		
		String strToAdd = null;
		
		for ( int i = 0; i < numberOfEvents; i++ ) {
			System.out.println("Insert an event: \n 'ENTER name CGPA ID' or 'SERVED': " );
			
			strToAdd = sc.nextLine();
			
			// Check the constrains for the String
			String[] tmp = strToAdd.split("\\s");
			
			try {
				System.out.println(groupOfEvents);
				System.out.println("Check event");
				String eventType = tmp[0];
				System.out.println(tmp[0]);
				assert (eventType.equalsIgnoreCase(Events.ENTER.toString())  
						|| eventType.equalsIgnoreCase(Events.SERVED.toString()));
				
				if (eventType.equalsIgnoreCase(Events.SERVED.toString())) {
					groupOfEvents.add(strToAdd);
					continue;
				}
					
				System.out.println("Check name");
				String name = tmp[1];
				assert name.length() >= 2 && name.length() <= 30;
				
				System.out.println("Check cgpa");
				double cgpa = Double.parseDouble(tmp[2]);
				assert (cgpa >= 0 && cgpa <= 4.0);
				
				System.out.println("Check id");
				int id = Integer.parseInt(tmp[3]);
				assert (id >= 1 && id <= Math.pow(10, 5));
				
				groupOfEvents.add(strToAdd);
				
			} catch (AssertionError e){
				System.out.println("Be careful to follow the instructions, please.");
				i--; // repeat the assignment until it is right		
			}

		}
		
		sc.close();
		
		
		List<Student> listOfStudents = SolutionPriorityQueue.getStudents(groupOfEvents);
		

		// If not empty, this prints the element from the list
		if (!listOfStudents.isEmpty()) {
			/*for (Student student : listOfStudents) {
				System.out.println(student.getName());
			}*/
			
			listOfStudents.stream()
							.map(e -> e.getName())
							.forEach(System.out::println);
			
		} else {
			System.out.println("EMPTY");
		}
		
	}
	

}


class Student implements Comparable<Student>{
	
	private int ID;
	private String name;
	private double CGPA;
	
	public Student(int id, String name, double cgpa) {
		
		this.ID = id;
		this.name = name;
		this.CGPA = cgpa;
	}
	


	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public double getCGPA() {
		return CGPA;
	}




	/*
	 * It compares first by grade, then by name and lastly by id.
	 */

	@Override
	public int compareTo(Student student) {
		System.out.println("Check compareTo");
		if(this.getCGPA() == student.CGPA) {
			System.out.println("Check CGPA");
			if(this.getName().compareTo(student.name) == 0) {  // lexicographically
				System.out.println("Check IDs");
				if (this.getID() == student.ID) {
					return 0;
					
				}	else if(this.getID() > student.ID) {
					return -1;	
					
				} else {
					return 1;
				}
				
			} else if(this.getName().compareTo(student.name) == 1) {
				return -1;	
				
			} else {
				return 1;
			}
		
		} else if(this.getCGPA() >= student.CGPA) {
			return -1;	
		
		} else {
			return 1;
		}
	}
	
	
}