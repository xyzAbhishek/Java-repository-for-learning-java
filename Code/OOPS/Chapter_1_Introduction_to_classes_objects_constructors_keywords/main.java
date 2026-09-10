class main{
	public static void main(String[] args) {
		student std = new student(32,"cd",67);
	//	std.roll_no = 23;
	//	std.name = "Abhishek";
		System.out.println(std.name);
		System.out.println(std.marks);
		System.out.println(std.roll_no);

		student first = new student(std);
		System.out.println(first.name);
		System.out.println(first.marks);
		System.out.println(first.roll_no);

	}
}
class student{
	int roll_no;
	String name;
	int marks;

    student (){
    	this.roll_no = 12;
    	this.name = "Abhishek Kumar Singh";
    	this.marks = 97;
    }
    student(int roll_no,String name,int marks){
    	this.roll_no = roll_no;
    	this.name = name;
    	this.marks = marks;
    }
    student(student first){
        this.roll_no = first.roll_no;
    	this.name = first.name;
    	this.marks = first.marks;    
    }
}