class main4{
    static class Test{
       static String name;

       Test(String name){
             this.name = name;
       }

    }
	public static void main(String[] args) {
		Test a = new Test("Abhishek");
		Test b = new Test("Shashank");

		System.out.println(a.name);
		System.out.print(b.name);
	}
}