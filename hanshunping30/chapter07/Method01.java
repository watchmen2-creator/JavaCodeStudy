public class Method01 {
	public static void main(String[] args){
		Person p = new Person();
		p.speak();

	}
}

class Person{
	String name ;
	int age ;

	public void speak(){
		System.out.println("i am a nice Person");
	}


}
