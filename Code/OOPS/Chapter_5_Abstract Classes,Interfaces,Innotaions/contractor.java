class contractor extends Employee{
	int hourlyRate;

	public contractor(String name,int employeeId,int hourlyRate){
		super(name,employeeId);
		this.hourlyRate = hourlyRate;
	}

	@Override
	public int calculateSalary(){
		int salary = hourlyRate*24*30;
		System.out.println("The name is "+name+",The Salary is "+salary);
		return salary;
	}
}