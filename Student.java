package student;

public class Student extends Person implements Introduce {
	private String job;
	private double fine;

	public Student(String name, int age, String job, double fine) {
		super(name, age);
		this.job = job;
		this.fine = fine;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}

	public boolean isGoToSchoolLate() {
		fine = fine + 10;
		return true;
	}

	@Override
	public void introduce() {
		System.out.println("Name: " + name + ",age: " + age + ",job: " + job
				+ ",fine: " + fine);

	}

}
