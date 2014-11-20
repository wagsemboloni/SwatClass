//gym exercises

import java.util.*;
public class PatternsII{
	public static void main(String[] args){
		//declare variables
		Scanner in = new Scanner(System.in);
		int w;
		for(int i = 0; i < 4; i++){
			System.out.println("What weight are we lifting for set "+(i+1)+"Muscle");
			w = in.nextInt();
			System.out.println("Set" + i + " of 10");
			for(int j = 1; j < 10; j++){	
				System.out.println("Bench press " +w+ "kg");
			}
			System.out.println();
			w = w - 10;
		}		
		
		
	}
}