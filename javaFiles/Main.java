/*
 * Main class for the AssociationTable, a small program using tables and students.
 */
public class Main {
	public static void main(String[] args) {
		
		//Create an associationTable:
		AssociationTable<Student, Integer> table = null;
		//Create grades and students:
		Integer[] studentGrades = {78, 92, 67};
		Student[] students = new Student[3];
		students[0] = new Student("Yarden", "Shay", "315656991", 1996);
		students[1] = new Student("Shir", "Shani", "0056661", 1938);
		students[2] = new Student("Or", "Haroe", "200101872", 1976);
		
		//Check if the table is legal, if not then catch the problem
		try {
			table = new AssociationTable<>(students, studentGrades);
			
		} catch (IllegalArgumentException e) {
			//Default message
		}
		
		Student newStudent = new Student("Chen", "Ulmer", "2888888", 1988);
		table.add(newStudent, 27);
		//TODO: update a grade of a student
		table.remove(students[0]);
		System.out.println(table);
	}
}
