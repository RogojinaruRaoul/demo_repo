package automation.oop.Inheritance2;

public class Student extends Person {

	private String classId;
	private byte yearOfStudy;
	private String majorField;
	private String regNo;

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public byte getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(byte yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public String getMajorField() {
		return majorField;
	}

	public void setMajorField(String majorField) {
		this.majorField = majorField;
	}

	public String getRegNo() {
		return regNo;
	}

}
