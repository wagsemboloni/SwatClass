/*
*Area calculation
*5/10/2014
*@author Derek Caprani
*/

public class AreaCalculation{
	//declare variables/Data Members
	private double length, width, area;

	//constructor
	public AreaCalculation(){
		length = 0.0;
		width = 0.0;
		area = 0.0;
	}
	//set methods - void means receiving/ return means given
	public void setLength(double length){
		this.length = length;
	}
	public void setWidth(double width){
		this.width = width;
	}
	//Get method
	public double getArea(){
		return area;
	}
	//compute method
	public void compute(){
		area = length * width;
	}

}