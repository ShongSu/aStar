package AStar_Alg;
import java.io.*;

public class MainSearch {
	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			System.out.println("-------Test for Maze Problem-------");
			
			while(true) {
				System.out.println("\nPlease select the type of the maze world:");
				System.out.println("A. maze 1, 7x7 world");
				System.out.println("B. maze 2, 9x9 world");
				System.out.println("E. Exit");
		
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String option= br.readLine();
				option = option.toUpperCase();
				//System.out.println("This is "+ option);
				if(option.equals("A")){
					Search maze1 = new Search();
					maze1.Menu(1);
					
					
				}
				else if(option.equals("B")){
					Search maze2 = new Search();
					maze2.Menu(2);
				}
			
				else if(option.equals("E")){
					break;
					
				}
				else{
					System.out.println("Illegal input, try again.");
				}

			}

		}

}
