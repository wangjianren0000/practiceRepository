package bean;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Department {

	private Integer id;
	private String name;
	private String address;
	private Integer chargeId;// 负责人id

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Integer id, String name, String address, Integer chargeId) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.chargeId = chargeId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getChargeId() {
		return chargeId;
	}

	public void setChargeId(Integer chargeId) {
		this.chargeId = chargeId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
