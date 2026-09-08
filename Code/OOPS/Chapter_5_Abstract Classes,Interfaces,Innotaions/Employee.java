abstract class Employee{
	public String name;
	public int employeeId;

	public Employee(String name,int employeeId){
		this.name = name;
		this.employeeId = employeeId;
	}

	public abstract int calculateSalary();
}