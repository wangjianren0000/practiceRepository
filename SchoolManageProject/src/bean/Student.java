package bean;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Student extends Person {

	private Integer grade;
	private Integer clazz;
	private List<Course> courses;
	private double totalStudyScores;
	private double gotStudyScores;
	private int isAgain;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String familyName, String lastName, char gender, Integer age, double height,
			double weight, String birthDay, String city, String xiancheng, String zone) {
		super(id, familyName, lastName, gender, age, height, weight, birthDay, city, xiancheng, zone);
		// TODO Auto-generated constructor stub
	}

	public Student(Integer grade, Integer clazz, List<Course> courses, double totalStudyScores, double gotStudyScores,
			int isAgain) {
		super();
		this.grade = grade;
		this.clazz = clazz;
		this.courses = courses;
		this.totalStudyScores = totalStudyScores;
		this.gotStudyScores = gotStudyScores;
		this.isAgain = isAgain;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getClazz() {
		return clazz;
	}

	public void setClazz(Integer clazz) {
		this.clazz = clazz;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public double getTotalStudyScores() {
		return totalStudyScores;
	}

	public void setTotalStudyScores(double totalStudyScores) {
		this.totalStudyScores = totalStudyScores;
	}

	public double getGotStudyScores() {
		return gotStudyScores;
	}

	public void setGotStudyScores(double gotStudyScores) {
		this.gotStudyScores = gotStudyScores;
	}

	public int getIsAgain() {
		return isAgain;
	}

	public void setIsAgain(int isAgain) {
		this.isAgain = isAgain;
	}

	@Override
	public String toString() {
		return super.toString() + " " + ToStringBuilder.reflectionToString(this);
	}

}
