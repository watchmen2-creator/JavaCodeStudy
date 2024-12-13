public class RecursionExercise01 {
	public static void main(String[] args){
		Function fun = new Function();
		System.out.println("fibonacci");
		for (int i = 1 ; i <= 7 ; i++){
			System.out.println(fun.fibonacci(i));
		}

		System.out.println("monkeysEatPeaches");
		System.out.println(fun.monkeysEatPeaches(10));
		
		System.out.println("monkeysEatPeaches");
		int [][] maze = new int[8][7];
		//dingyi waiweiqiangbi 
		for (int i = 0 ;i < maze.length ; i++){
			for(int j = 0 ; j < maze[i].length ; j++){
				if(i == 0 || i == maze.length - 1 || j == 0 || j == maze[i].length - 1){
					maze[i][j] = -1 ;
				}
			}
		}


		for (int a = 0 ;a < maze.length ; a++){
			for(int b = 0 ; b < maze[a].length ; b++){
				System.out.print(maze[a][b] + "\t");
			}
			System.out.println();
		}
	}
}


class Function{
	public int fibonacci(int n){
		if( n == 1 || n == 2 ){
			return 1 ;
		}else{
			return fibonacci( n - 1 ) + fibonacci( n - 2 ) ;
		}
	}

	public int monkeysEatPeaches(int day){		
		if(day == 1 ){
			return 1;
		}
		return (monkeysEatPeaches(day - 1) + 1 )  * 2;		
	}

	public void mouseOutMaze(){

	}

}