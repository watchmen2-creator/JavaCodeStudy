public class HomeWork {
	public static void main(String[] args){
		System.out.println("************************");
		System.out.println("HomeWork01");
		HomeWork01 h1 = new HomeWork01();
		double[] nums = {1.0 , 55 , 32.5 , 99.9 , 45.7 , 0 , 0.0 , 0.02 , -89 , -9.5 } ;
		System.out.println(h1.max(nums));

		System.out.println("************************");
		System.out.println("HomeWork02");
		HomeWork02 h2 = new HomeWork02();
		String[] strs = {"zhangsan" , "lisi" , "wangwu" , "zhangchulan" } ;
		System.out.println(h2.find(strs , "lisi"));

		System.out.println("************************");
		System.out.println("HomeWork03");
		HomeWork03 h3_1 = new HomeWork03(188.8) ;
		System.out.println("after updatePrince , the price is " + h3_1.updatePrince());
		HomeWork03 h3_2 = new HomeWork03(150.0) ;
		System.out.println("after updatePrince , the price is " + h3_2.updatePrince());
		HomeWork03 h3_3 = new HomeWork03(125.7) ;
		System.out.println("after updatePrince , the price is " + h3_3.updatePrince());
		HomeWork03 h3_4 = new HomeWork03(100.0) ;
		System.out.println("after updatePrince , the price is " + h3_4.updatePrince());
		HomeWork03 h3_5 = new HomeWork03(50.0) ;
		System.out.println("after updatePrince , the price is " + h3_5.updatePrince());


		System.out.println("************************");
		System.out.println("HomeWork08") ;
		new HomeWork08().count1(); //10
		HomeWork08 h8 = new HomeWork08() ;
		h8.count2() ;//9
		h8.count2() ;//10


		System.out.println("************************");
		System.out.println("HomeWork10") ;
		HomeWork10 h10_1 = new HomeWork10();
		HomeWork10 h10_2 = h10_1 ;
		h10_2.m(); // i = 101 j = 100 
		System.out.println(h10_1.i); // 101
		System.out.println(h10_2.i); // 101

		System.out.println("************************");
		System.out.println("HomeWork11") ;
		HomeWork11 h11 = new HomeWork11();
		System.out.println(h11.method(h11.method(10.0 , 20.0) , 100));

		System.out.println("************************");
		System.out.println("HomeWork12") ;
		HomeWork12 h12_1 = new HomeWork12 ("zahngsan" , 'W' , 24);
		h12_1.show() ;
		HomeWork12 h12_2 = new HomeWork12 ("boss" , 50000.12 );
		h12_2.show() ;
		HomeWork12 h12_3 = new HomeWork12 ("lina" , 'M' , 32 , "taxi driver" , 18546.78 );
		h12_3.show() ;




	}
}

class HomeWork01 {
	public double max(double[] nums){
		double maxNum = nums[0];
		for (int i = 0 ; i < nums.length ; i++){
			maxNum = maxNum > nums[i] ? maxNum : nums[i] ;
		}
		return maxNum ;
	}
}

class HomeWork02 {
	public int find(String[] strs , String str){
		int index = -1 ;
		for (int i = 0 ; i < strs.length ; i++){
			index = str.equals(strs[i]) ? i : index ;
		}
		return index ;
	}
}

class HomeWork03 {
	double price ;
	public HomeWork03(double price){
		this.price = price ;
	}
	public double updatePrince(){
		this.price = this.price > 100 ? ( this.price > 150 ? 150 : 100 ) : this.price ;
		return this.price ;
	}
}

class HomeWork04 {
	public int[] copyArr (int[] arr){
		int [] copyArr = new int[arr.length] ;
		for (int i = 0 ; i < arr.length ; i++){
			copyArr[i] = arr[i] ;
		}
		return copyArr ;
	}

	public double[] copyArr (double[] arr){
		double [] copyArr = new double[arr.length] ;
		for (int i = 0 ; i < arr.length ; i++){
			copyArr[i] = arr[i] ;
		}
		return copyArr ;
	}

	public String[] copyArr (String[] arr){
		String [] copyArr = new String[arr.length] ;
		for (int i = 0 ; i < arr.length ; i++){
			copyArr[i] = arr[i] ;
		}
		return copyArr ;
	}

}

class HomeWork05 {	
	double radius ;
	public HomeWork05 (double radius){
		this.radius = radius ;
	}
	public double perimeter(double radius){
		return 2 * 3.14159265354 * radius ;
	}
	public double area(double radius){
		return 3.14159265354 * radius * radius ;
	}
}

class HomeWork06 {	
	double num1  , num2 ;
	public double add (double num1 , double num2){
		return num1 + num2 ;
	}
	public double subtract(double num1 , double num2){
		return num1 - num2 ;
	}
	public double multiply(double num1 , double num2){
		return num1 * num2 ;
	}
	public double divide(double num1 , double num2){
		if(num2 == 0 ){
			System.out.println("error");
			return 0 ;
		}else{
			return num1 / num2 ;			
		}
	}
}

class HomeWork07 {	
	String name ;
	String color ;
	int age ;
	public HomeWork07 (String name , String color , int age){
		this.name = name ;
		this.color = color ;
		this.age = age ;
	}
	public void show (){
		System.out.println("this.name : " + this.name ) ;
		System.out.println("this.color : " + this.color ) ;
		System.out.println("this.age : " + this.age ) ;
	}
}

class HomeWork08 {	
	int count = 9 ;
	public void count1 (){
		count = 10 ;
		System.out.println("count1 = " + count ) ;
	}
	public void count2 (){
		System.out.println("count1 = " + count++ ) ;
	}
}

class HomeWork09 {	
	String name ;
	double times ;
	public void play (){
		System.out.println("this.name : " + this.name ) ;
		System.out.println("this.times : " + this.times ) ;
		System.out.println("123456789") ;
	}
	
	public void getInfo (){
		System.out.println("this.name : " + this.name ) ;
		System.out.println("this.times : " + this.times ) ;
	}
}

class HomeWork10 {	
	int i = 100 ;
	public void m (){
		int j = i++ ;
		System.out.println("i = " + i ) ;
		System.out.println("j = " + j ) ;
	}	
}

class HomeWork11 {
	public double method (double n1 , double n2){
		return n1 + n2 ;
	}
}

class HomeWork12 {
	String name ;
	char sex ;
	int age ;
	String position ;
	double salary ;
	public HomeWork12 (String name , char sex , int age ){
		this.name = name ;
		this.sex = sex ;
		this.age = age ;
	}
	public HomeWork12 (String position , double salary ){
		this.position = position ;
		this.salary = salary ;
	}
	public HomeWork12 (String name , char sex , int age , String position , double salary ){
		this( name , sex , age ) ;
		this.position = position ;
		this.salary = salary ;
	}
	public void show (){
		System.out.println("--------------------" );
		System.out.println("name :" + this.name );
		System.out.println("sex :" + this.sex );
		System.out.println("age :" + this.age );
		System.out.println("position :" + this.position );
		System.out.println("salary :" + this.salary );
		System.out.println("--------------------" );

	}
}