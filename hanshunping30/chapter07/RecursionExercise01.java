public class RecursionExercise01 {
	public static void main(String[] args){
		Function fun = new Function();
		System.out.println("fibonacci");
		for (int i = 1 ; i <= 7 ; i++){
			System.out.println(fun.fibonacci(i));
		}

		System.out.println("monkeysEatPeaches");
		System.out.println(fun.monkeysEatPeaches(10));
		
		System.out.println("mouseOutMaze");
		int [][] maze = new int[8][7];
		//dingyi waiweiqiangbi 
		for (int i = 0 ;i < maze.length ; i++){
			for(int j = 0 ; j < maze[i].length ; j++){
				if(i == 0 || i == maze.length - 1 || j == 0 || j == maze[i].length - 1){
					maze[i][j] = -1 ;
				}
			}
		}

		//dingyi neibuqiangbi
		maze[3][1] = -1 ;
		maze[3][2] = -1 ;
		// maze[1][2] = -1 ;
		maze[2][2] = -1 ;
		// maze[2][3] = -1 ;
		// maze[5][4] = -1 ;
		// maze[5][5] = -1 ;
		// maze[2][4] = -1 ;
		// maze[2][5] = -1 ;


		fun.findWay(maze , 1 , 1 );
		// fun.mouseOutMaze(maze , 1 , 1 );

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

	public boolean mouseOutMaze(int [][]  map , int x , int y){
		return true ;
	}

	/*
		map shi ditu ,x \ y shi weizhi
		0 > keyizou ; -1 > buneng zou ; 1 > keyizou tongde lu ; 2 > zouguodanshizoubutong 
	*/
	public boolean findWay(int [][] map , int x , int y ){
		if(map[6][5] == 1){
			return true ;
		}else{
			if(map[x][y] == 0){
				map[x][y] = 1 ;
				if(findWay(map , x + 1 , y)){
					return true ;
				}else if(findWay(map , x , y + 1)){
					return true ;
				}else if(findWay(map , x - 1 , y)){
					return true ;
				}else if(findWay(map , x , y - 1)){
					return true ;
				}else{
					map[x][y] = 2 ;
					return false ;
				}
			}else {//-1\1\2
				return false ;
			}
		}
	}

}