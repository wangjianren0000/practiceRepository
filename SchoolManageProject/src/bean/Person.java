package bean;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {

	private Integer id;
	private String familyName;
	private String lastName;
	private char gender;
	private Integer age;
	private double height;
	private double weight;
	private String birthDay;
	private String city;
	private String xiancheng;
	private String zone;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Integer id, String familyName, String lastName, char gender, Integer age, double height,
			double weight, String birthDay, String city, String xiancheng, String zone) {
		super();
		this.id = id;
		this.familyName = familyName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.birthDay = birthDay;
		this.city = city;
		this.xiancheng = xiancheng;
		this.zone = zone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getXiancheng() {
		return xiancheng;
	}

	public void setXiancheng(String xiancheng) {
		this.xiancheng = xiancheng;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
