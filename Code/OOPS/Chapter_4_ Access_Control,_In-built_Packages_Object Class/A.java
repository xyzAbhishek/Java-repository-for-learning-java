class A {
	protected int num = 5;;
	int age;
	String name;
	int[] arr;

	public int getnum(){
		return this.num;
	}

	public void setnum(int num){
        this.num = num;
	}

/*	public A(){
		this.num = num;
		this.age = age;
		this.name = name;
		this.arr = new int[num];
*/
	public static void main(String[] args) {
		A obj = new A();
	}
}  

class B extends A{
	public static void main(String[] args) {
		A obj = new A();
		obj.num++;
		System.out.print(obj.num);
	}
	
}
