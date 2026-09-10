import java.util.*;
class main2{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the age");
        int age = sc.nextInt();
        
        System.out.println("Enter the percentage");
        Double percent = sc.nextDouble();

        System.out.println("Enter the name");
        String name = sc.next();

        System.out.print(name+"is "+age+" years old "+"his percentage is "+percent);
        sc.close();
	}
}