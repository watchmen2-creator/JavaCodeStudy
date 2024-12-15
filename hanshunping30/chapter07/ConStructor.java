public class ConStructor {
	public static void main(String[] args){
		Person p1 = new Person("jack" , 15 );
		Person p2 = new Person("lucy" );		
		Person p3 = new Person();		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p3.name);
		System.out.println(p3.age);
	}
}


class Person {
	String name ;
	int age ;
	Person(){
		age = 18 ;
	}
	Person(String objName , int objAge){
		name = objName ;
		age = objAge ;
	}
	Person(String objName ){
		name = objName ;
		age = 18 ;
	}
}
