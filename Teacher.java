package student;

public class Teacher extends Person implements Introduce {
	private int experience;
	private String subject;

	public Teacher(String name, int age, int experience, String subject) {
		super(name, age);
		this.experience = experience;
		this.subject = subject;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void introduce() {
		System.out.println(" Name: " + name + ",age: " + age + ",experience: "
				+ experience + ",subject: " + subject);
	}

}
