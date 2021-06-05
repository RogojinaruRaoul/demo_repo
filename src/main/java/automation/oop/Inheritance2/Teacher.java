package automation.oop.Inheritance2;

public class Teacher extends Person {
	private double salary;
	private String subjectMatter;
	private byte experienceYears;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSubjectMatter() {
		return subjectMatter;
	}

	public void setSubjectMatter(String subjectMatter) {
		this.subjectMatter = subjectMatter;
	}

	public byte getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(byte experienceYears) {
		this.experienceYears = experienceYears;
	}
}
