public class PasswordHack{
	//declare data members
	private String pWords[];
	private String gWord;
	private String	pWord;
	private int rand;
	private int numLetters, numNums;

	//controctor
	public PasswordHack(){
		pWords = new String[]{"123abc", "f4g5hi", "d9v87b"};
		pWord = new String();
		gWord = new String();
		rand = 0;
		numLetters = 0;
		numNums = 0;
	}
	public void choosePWord(){
		rand = (int)(Math.random()*3);
		pWord = pWords[rand];
		letNums(pWord);
	}
	public void setGWord(String gWord){
		this.gWord = gWord;
	}
	public void letNums(String pWord){
			for(int i = 0; i < pWord.length(); i++){
				if(pWord.charAt(i) == '0' ||
					pWord.charAt(i) == '1' ||
					pWord.charAt(i) == '2' ||
					pWord.charAt(i) == '3' ||
					pWord.charAt(i) == '4' ||
					pWord.charAt(i) == '5' ||
					pWord.charAt(i) == '6' ||
					pWord.charAt(i) == '7' ||
					pWord.charAt(i) == '8' ||
					pWord.charAt(i) == '9'){
						numNums	++;
				}else{
					numLetters ++;
				}
			}//end of loops
	}//end of method letNums
	//compute gues
	public void computeGues(){
		for(int i = 0; i < gWord.length(); i++){
			if(gWord.charAt(i) == pWord.charAt(i)){
				//
			}
			else{

			}
		}
	}
	public String showNumbsLetters(){
			return "The secret word has " +numLetters+ " letters and " +numNums+ " numbers";
	}
}//end of class