
public class Manager extends Employee{
	private String department;
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	private int salary;

	public Manager(String empName, int empId, String manDept, int manSalary) {
		super(empName, empId);
		this.department = manDept;
		this.salary = manSalary;
		
		// TODO Auto-generated constructor stub
	}
	

}
