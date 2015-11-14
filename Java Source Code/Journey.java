/**********************************
*	A class to represent a        *
*	journey taken by a user       *
*                                 *
***********************************/

public class Journey{
	
	private Station startPoint;
	private Station endPoint;
	private double monthlyBalance;
	
	public Journey(){
		this.startPoint = new Station();
		this.endPoint = new Station();
		this.monthlyBalance = 0.0;
	}
	
	public Journey(Station start, Station end ){
		this.startPoint = start;
		this.endPoint = end;
		this.monthlyBalance = 0.0;
	}
	
	public void setStart(Station startingPos){
		this.startPoint = startingPos;
	}
	
	public void setEnd(Station endingPos){
		this.endPoint = endingPos;
	}
	
	public Station getStart(){
		return this.startPoint;
	}
	
	public Station getEnd(){
		return this.endPoint;
	}
	
	public void setBalance(double bal){
		this.monthlyBalance = bal;
	}
	
	public double getBalance(){
		return this.monthlyBalance;
	}
}