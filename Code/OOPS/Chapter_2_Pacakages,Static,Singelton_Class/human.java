class human{
	int age = 18;
	String name = "Abhishek";
	String gender = "Male";
	static int salary = 50000000;
    static int population = 0;
	human(int age,String name,String gender,int salary){
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		human.population = population+1;
    }
	static int message(){
		return salary;
	}
    public static void main(String[] args) {
	message();
	}
}