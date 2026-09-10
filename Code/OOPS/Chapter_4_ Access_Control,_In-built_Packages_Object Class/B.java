class B extends A{
	public static void main(String[] args) {
		A obj = new A();
		obj.num++;
		System.out.print(obj.num);
	}
}

class subclass extends B{
	public static void main(String[] args) {
		subclass sb = new subclass();
		sb.num++;
		System.out.println(sb.num);
	}
}
