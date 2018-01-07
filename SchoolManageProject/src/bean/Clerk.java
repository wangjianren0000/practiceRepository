package bean;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Clerk extends Person{

	private Integer work;
	private Integer department;
	private String workCardNo;
	private Integer isLead;
	private String tel;
	
	public Clerk() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Clerk(Integer id, String familyName, String lastName, char gender, Integer age, double height, double weight,
			String birthDay, String city, String xiancheng, String zone) {
		super(id, familyName, lastName, gender, age, height, weight, birthDay, city, xiancheng, zone);
		// TODO Auto-generated constructor stub
	}

	public Clerk(Integer work, Integer department, String workCardNo, Integer isLead, String tel) {
		super();
		this.work = work;
		this.department = department;
		this.workCardNo = workCardNo;
		this.isLead = isLead;
		this.tel = tel;
	}

	public Integer getWork() {
		return work;
	}

	public void setWork(Integer work) {
		this.work = work;
	}

	public Integer getDepartment() {
		return department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	public String getWorkCardNo() {
		return workCardNo;
	}

	public void setWorkCardNo(String workCardNo) {
		this.workCardNo = workCardNo;
	}

	public Integer getIsLead() {
		return isLead;
	}

	public void setIsLead(Integer isLead) {
		this.isLead = isLead;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return super.toString() +" "+ ToStringBuilder.reflectionToString(this);
	}
	
	
}
