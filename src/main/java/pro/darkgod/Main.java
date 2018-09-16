package pro.darkgod;

import pro.darkgod.model.Student;
import pro.darkgod.utils.SortArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		List<Student> students = new ArrayList<>();
		
		short amountOfStudents = reader.nextShort();
		
		do {
			int id = reader.nextInt();
			String name = reader.next();
			double cgpa = reader.nextDouble();
			
			students.add(new Student(id,  name, cgpa));
			
			amountOfStudents--;
		} while (amountOfStudents > 0);
		
		SortArray sortArray = new SortArray();
		List<Student> orderedStudents = sortArray.sort(students);
		for (Student student : orderedStudents) {
			System.out.println(student.getName());
		}
		
		reader.close();
	}
}
