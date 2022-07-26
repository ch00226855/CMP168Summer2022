package week2day2;

public class Student implements Comparable<Student> {
	
	private int iD;
	private String name;
	
	public Student(int iD, String name) {
		this.iD = iD;
		this.name = name;
	}

	public int getiD() {
		return iD;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student otherStudent) {
		if (this.iD < otherStudent.getiD()) {
			return -1;
		} else if (this.iD == otherStudent.getiD()) {
			return 0;
		} else {
			return 1;
		}
	}

	
	@Override
	public String toString() {
		return this.name + this.iD;
	}
}
