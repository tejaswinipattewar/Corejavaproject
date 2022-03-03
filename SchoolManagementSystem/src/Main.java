import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Teacher t1 = new Teacher(1, "t1", 500);
		Teacher t2 = new Teacher(2, "t2", 700);
		Teacher t3 = new Teacher(1, "t3", 600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(t1);
		teacherList.add(t2);
		teacherList.add(t3);
		
		Student s1 = new Student(1,"s1",4);
		Student s2 = new Student(2,"s2",12);
		Student s3 = new Student(3,"s3",5);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(s3);
		studentList.add(s2);
		studentList.add(s1);
		
		School ghs = new School(teacherList,studentList);
		
		s1.payFees(5000);
		
		s2.payFees(6000);
		System.out.println("GHS has earned "+ghs.getTotalMoneyEarned());
		
		System.out.println("-----Making GHS PAy SALARY-----");
		t1.receiveSalary(t1.getSalary());
		System.out.println("GHS has spent salary to " + t1.getName()
		+" and now has "+ghs.getTotalMoneyEarned());
		
		
	}
}
