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
