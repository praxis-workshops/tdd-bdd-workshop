package pro.darkgod.model;

public class Student implements Comparable<Student> {

	private final int id;
	private final String name;
	private final double cgpa;
	
	public Student(int id, String name, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	@Override
	public int compareTo(Student other) {
		if (this.cgpa > other.cgpa) {
			return -1;
		} else if (this.cgpa == other.cgpa) {
			int compared = this.name.compareTo(other.name);
			return compared != 0 ? compared : (this.id - other.id ) < 0 ? -1: 1;
		}
		
		return 1;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}
}
