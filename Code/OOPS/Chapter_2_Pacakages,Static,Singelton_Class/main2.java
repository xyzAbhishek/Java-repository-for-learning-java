class main2{
	public static void main(String[] args) {
		pop();

	}

	static void pop(){
		System.out.print("hello buddy!");
		main2 m2 = new main2();
		m2.greetings();
	}
 // if something is not static , it belongs to an object for sure.
 // thats why we need to make an object for the non-static functions/methods.
	void greetings(){
		System.out.print("How are you!");
	}

}
