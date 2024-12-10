public class PropertiesDetails {
	public static void main(String[] args){
		Person p1 = new Person() ;
		System.out.println("Person's default information is :");
		System.out.println("age = " + p1.age + "; name = " + p1.name + "; sal = " + p1.sal + "; isPass = " + p1.isPass);
	}
}

class Person{
	int age ;
	String name ;
	double sal ;
	boolean isPass ;
}
