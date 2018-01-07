package bean;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Course {

	private Integer id;
	private String name;
	private Integer cTime;// 课时
	private Integer grade;
	private Integer isCommon;
	private Integer studyScore;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String name, Integer cTime, Integer grade, Integer isCommon, Integer studyScore) {
		super();
		this.name = name;
		this.cTime = cTime;
		this.grade = grade;
		this.isCommon = isCommon;
		this.studyScore = studyScore;
	}

	public Course(Integer id, String name, Integer cTime, Integer grade, Integer isCommon, Integer studyScore) {
		super();
		this.id = id;
		this.name = name;
		this.cTime = cTime;
		this.grade = grade;
		this.isCommon = isCommon;
		this.studyScore = studyScore;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getcTime() {
		return cTime;
	}

	public void setcTime(Integer cTime) {
		this.cTime = cTime;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getIsCommon() {
		return isCommon;
	}

	public void setIsCommon(Integer isCommon) {
		this.isCommon = isCommon;
	}

	public Integer getStudyScore() {
		return studyScore;
	}

	public void setStudyScore(Integer studyScore) {
		this.studyScore = studyScore;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
