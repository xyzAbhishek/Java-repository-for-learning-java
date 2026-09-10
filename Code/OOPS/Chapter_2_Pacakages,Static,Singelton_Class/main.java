//package Chapter_2_Pacakages,Static,Singelton_Class;
//import static OOPS.Chapter_1_Introduction_to_classes_objects_constructors_keywords.main2.message;
class main{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a = 10;
		System.out.println(a);
	    human h1 = new human(16,"Abhi","Male",560000);
	    human h2 = new human(16,"Abhi","Male",560000);
	    System.out.print(human.message());
	}
}