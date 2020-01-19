package testbeans;

public class Department {

	private Integer depatmentId;
	private String departmentName;
	
	public Department() { }
	
	public Department(Integer depatmentId, String departmentName) {
		this.depatmentId = depatmentId;
		this.departmentName = departmentName;
	}
	public Integer getDepatmentId() {
		return depatmentId;
	}
	public void setDepatmentId(Integer depatmentId) {
		this.depatmentId = depatmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		super.toString();
		return (" Department Id --> " + depatmentId + " Department Name --> " + departmentName);
	}
}
