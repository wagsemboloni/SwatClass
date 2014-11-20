public class PatternsI{
	public static void main(String[] args){
		//declare variables
		
		for(int i = 1; i < 5;i++){
			for(int j = 0; j < i; j++){//for this loop accur the loop above has to be less than i
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
}