import java.util.Scanner ;
import java.util.Random ;

public class HomeWork {
	public static void main(String[] args){
		System.out.println("12");
	}
}

class HomeWork04{
	public static void main(String[] args){
		int [] arr = {10 , 12 , 45 , 90 , 120 } ;
		int [] arr2 = new int[arr.length + 1 ] ;
		int num = 80 ;
		for (int i = 0 ; i < arr.length ; i++){
			if (arr[i] <= num ){
				arr2[i] = arr[i];				
			}else{
				arr2[i] = num ;
				num = arr[i];
			}
		}
		arr2[arr2.length - 1 ] = num ;
		System.out.println("----------");
		for (int i = 0 ;i < arr2.length ; i++){
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
}



class HomeWork05{
	public static void main(String[] args){
		int [] arr = new int[10] ;
		Random iran = new Random();
		int sum = 0 ;
		double avg ;
		int maxNum ;
		int index = arr.length - 1 ;
		for (int i = 0 ; i < arr.length ; i++){
			arr[i] = iran.nextInt(100) + 1 ;
			sum += arr[i] ;
		}
		maxNum =  arr[arr.length - 1 ] ;
		for(int i = arr.length - 1  ; i >= 0 ; i--){
			maxNum = (maxNum >= arr[i]) ? maxNum : arr[i] ;
			index = (maxNum == arr[i])?i:index;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		avg = sum / 10.0 ;
		System.out.println("avg = " + avg + " index = " + index);

	}
}

class HomeWork07{
	public static void main(String[] args){
		Scanner iscan  = new Scanner(System.in) ; 
		System.out.println("Enter an integer to define the length of an array");
		int length = iscan.nextInt() ; 
		int [] arr = new int[length];
		Random iran = new Random();
		for (int i = 0 ; i < length ; i++){
			arr[i] = iran.Random(100) + 1 ;
		}
		System.out.println("The elements of this array are:");
		for(int i = 0 ; i < length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int temp = 0 ;
		for (int i = length - 1 ; i >= 0 ; i--){
			for (int j = 0 ; j <= i ; j++){
				
			}
		}

	}
}