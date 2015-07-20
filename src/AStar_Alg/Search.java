package AStar_Alg;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Search {
	
	int stepsA;
	int stepsB;
	int stepsC;
	int stepsD;
	int MinimumSteps;
	char MinimumStart;
    
    public static void main(String[] args){

        
    }
    
    public void Menu(int type) throws Exception{
    	if (type==1){
    		int[][] map=new int[][]{// 地图数组
    	                {1,1,1,0,1,1,1},
    	                {1,0,1,1,0,1,1},
    	                {1,0,1,1,0,1,1},
    	                {1,0,0,1,0,1,1},
    	                {1,1,0,1,1,1,1},
    	                {1,1,0,0,0,1,1},
    	                {1,1,1,1,1,1,1}
    	        };
    		
		System.out.println("------------------------------Simulation of A* Search Maze 1  7x7 world---------------------------");
			
			for(int i=0;i<7;i++){
				for(int j=0;j<7;j++){
					if(i==0&&j==0)
						System.out.print("A ");
					else if(i==0&&j==6)
						System.out.print("B ");
					else if(i==6&&j==0)
						System.out.print("C ");
					else if(i==6&&j==6)
						System.out.print("D ");
					else if(i==3&&j==3)
						System.out.print("H ");
					else 
						System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("where '0' represents obstacle, '1' represents blank, 'A, B, C, D' represents 4 start positions, and 'H' represents goal position.");

			
			while(true) {
				System.out.println("\nPlease select your start position:");
				System.out.println("or 'T': Run four start position together");
				System.out.println("or 'E': Exit");
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String option= br.readLine();
				option = option.toUpperCase();
				//System.out.println("This is "+ option);
				if(option.equals("A")){
					Execution(0, 0, 3, 3, map);
				}
				
				else if(option.equals("B")){
					Execution(0, 6, 3, 3, map);
				}

				else if(option.equals("C")){
					Execution(6, 0, 3, 3, map);
				}
				else if(option.equals("D")){
					Execution(6, 6, 3, 3, map);
				}
				else if(option.equals("T")){
					stepsA = Execution(0, 0, 3, 3, map);
					stepsB = Execution(0, 6, 3, 3, map);
					stepsC = Execution(6, 0, 3, 3, map);
					stepsD = Execution(6, 6, 3, 3, map);
					MinimumSteps=stepsA;
					MinimumStart='A';
					if(MinimumSteps>=stepsB){
						MinimumSteps=stepsB;
						MinimumStart='B';
					}
						
					if(MinimumSteps>stepsC){
						MinimumSteps=stepsC;
						MinimumStart='C';
					}
						
					if(MinimumSteps>stepsD){
						MinimumSteps=stepsD;
						MinimumStart='D';
					}
						
					System.out.println("The winner of the competition is "+ MinimumStart +" , the total steps is "+MinimumSteps);
					
					
					
				}
				else if(option.equals("E")){
					break;
					
				}
				else{
					System.out.println("Illegal input, try again.");
				}
			}
			
			
			
			System.out.println();
			System.out.println("----------End of A* Search-----------");

	}
    	else if(type==2){
        		int[][] map=new int[][]{// 地图数组
        				{1,1,1,0,1,1,1,1,1},
                		{1,0,1,1,0,1,1,1,1},
                		{1,0,1,1,0,1,1,0,0},
                		{1,0,0,1,0,1,1,0,0},
                		{1,1,0,1,1,1,1,0,0},
                		{1,1,0,0,0,1,1,0,0},
                		{1,1,1,1,1,0,1,0,0},
                		{1,1,1,1,1,1,1,1,1},
                		{1,1,1,1,1,1,1,1,1}
        	        };
        		
    		System.out.println("------------------------------Simulation of A* Search Maze 2 9x9 world---------------------------");

    		for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					if(i==0&&j==0)
						System.out.print("A ");
					else if(i==0&&j==8)
						System.out.print("B ");
					else if(i==8&&j==0)
						System.out.print("C ");
					else if(i==8&&j==8)
						System.out.print("D ");
					else if(i==3&&j==3)
						System.out.print("H ");
					else 
						System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("where '0' represents obstacle, '1' represents blank, 'A, B, C, D' represents 4 start positions, and 'H' represents goal position.");

			
			while(true) {
				System.out.println("\nPlease select your start position:");
				System.out.println("or 'T': Run four start position together");
				System.out.println("or 'E': Exit");
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String option= br.readLine();
				option = option.toUpperCase();
				//System.out.println("This is "+ option);
				if(option.equals("A")){
					Execution(0, 0, 3, 3, map);
				}
				
				else if(option.equals("B")){
					Execution(0, 8, 3, 3, map);
				}

				else if(option.equals("C")){
					Execution(8, 0, 3, 3, map);
				}
				else if(option.equals("D")){
					Execution(8, 8, 3, 3, map);
				}
				
				else if(option.equals("T")){
					Execution(0, 0, 3, 3, map);
					Execution(0, 8, 3, 3, map);
					Execution(8, 0, 3, 3, map);
					Execution(8, 8, 3, 3, map);
				}
				
				else if(option.equals("E")){
					break;
					
				}
				else{
					System.out.println("Illegal input, try again.");
				}
			}
			
			
			
			System.out.println();
			System.out.println("----------End of A* Search-----------");
    	}
    	
    		
    	
		
	}
    public int Execution(int startX, int startY, int endX, int endY, int map[][]){
    	int size=0;
    	int steps=0;
    	if(map.length==7)
    		size=7;
    	else if (map.length==9)
    		size=9;
    	int [][] copymap=new int[map.length][map.length];
    	for(int i=0;i<map.length;i++){
    		for(int j=0;j<map.length;j++)
    			copymap[i][j]=map[i][j];
    	}
    	
    	
    	AStar aStar=new AStar(copymap, size, size);

        System.out.println("--------------------------------------------------------");
        int flag=aStar.search(startX, startY , endX, endY);

        if(flag==-1){
            System.out.println("传输数据有误！");
        }else if(flag==0){
            System.out.println("没找到！");
        }else{
            for(int x=0;x<size;x++){
                for(int y=0;y<size;y++){
                    if(copymap[x][y]==1){
                        System.out.print("  ");
                    }else if(copymap[x][y]==0){
                        System.out.print("X ");
                    }else if(copymap[x][y]==-1){
                    	if(x==startX && y==startY)
                    		System.out.print("S ");
                    	else if(x==endX && y==endY)
                    		System.out.print("H ");
                    	else{
                    		System.out.print("O ");
                    		steps++;
                    		
                    	}
                    		
                    }
                }
                System.out.println();
            }
            System.out.println("where 'S' represents Start Position, 'H' represents Goal Position,\n 'X' represents Obstacle, 'O' represents Path");
            System.out.println();
            steps++;
            System.out.println("Totally steps from is: "+steps);
        }
        return steps;

    }

}