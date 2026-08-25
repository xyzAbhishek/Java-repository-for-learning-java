class main5{
	static int a = 10;
	static int b;

	static {
		b = a*4;
	}
	public static void main(String[] args) {
		System.out.print(main5.a+main5.b);
	}
}