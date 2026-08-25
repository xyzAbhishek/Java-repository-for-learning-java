class main{

	static int num = 40;

	public static void main(String[] args) {
		shapes sh1 = new shapes();
		shapes sh2 = new rectangle();
		shapes sh3 = new square();
		circle sh4 = new circle();

        main m1 = new main();
        
        System.out.print(m1.num);
		sh1.area();
		sh2.area();
		sh3.area();
		sh4.perimeter();
	}
}