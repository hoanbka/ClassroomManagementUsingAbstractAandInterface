package student;

import java.util.ArrayList;

public class ClassRoom implements Introduce {
	private String className;
	private ArrayList<Student> students = new ArrayList<Student>();
	private Teacher teacher;
	private double fineSum;

	public ClassRoom(String className, ArrayList<Student> students,
			Teacher teacher, double fineSum) {
		super();
		this.className = className;
		this.students = students;
		this.teacher = teacher;
		this.fineSum = fineSum;
	}

	public ArrayList<Student> punishStudent() {
		ArrayList<Student> lateStudents = new ArrayList<Student>();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).isGoToSchoolLate()) {
				lateStudents.add(students.get(i));
			}
		}
		return lateStudents;
	}

	public void detailedPunishmentInfo() {
		ArrayList<Student> detailedList = punishStudent();
		for (int i = 0; i < detailedList.size(); i++) {
			detailedList.get(i).introduce();
		}

	}

	public double sumFine() {
		double sum = 0;
		for (int i = 0; i < students.size(); i++) {
			sum = sum + students.get(i).getFine();
		}
		return sum;
	}

	@Override
	public void introduce() {
		System.out.println("Class name" + className + ", total of students: "
				+ students.size() + ", teacher: " + teacher.getName()
				+ ", fineSum:" + fineSum);

	}

}
