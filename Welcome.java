// wagner

public class Welcome{
	//declare data members
	private String name;
	private String message;

	//constroctor
	public Welcome(){
		name = new String();
		message = new String();
	}
	//set method
	public void setName(String name){
		this.name = name;
	}

	//compute
	public void makeMessage(){
		message = "hi "+name+ " Welcome to the instatible class";
	}
	public String getMessage(){
		return message;
	}
}