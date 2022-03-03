import java.util.List;

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	public School(List<Teacher>teacher, List<Student> student) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public List<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student){
		students.add(student);
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	public static void updateTotalMoneySpent(int Moneyspent) {
		totalMoneyEarned-=Moneyspent;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teachers = teacher;
	}

	public void setStudent(List<Student> student) {
		this.students = student;
	}

	public  void setTotalMoneyEarned(int totalMoneyEarned) {
		this.totalMoneyEarned = totalMoneyEarned;
	}

	public void setTotalMoneySpent(int totalMoneySpent) {
		this.totalMoneySpent = totalMoneySpent;
	}

	@Override
	public String toString() {
		return "School [teachers=" + teachers + ", students=" + students + "]";
	}
	
	
	
	
	
}
