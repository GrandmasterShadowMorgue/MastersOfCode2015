public class Journey{
	
	private Station startPoint;
	private Station endPoint;
	private double balance;
	
	public Journey(){
		this.startPoint = new Station();
		this.endPoint = new Station();
		this.balance = 0.0;
	}
	
	public Journey(Station start, Station end ){
		this.startPoint = start;
		this.endPoint = end;
		this.balance = 0.0;
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
		this.balance = bal;
	}
	
	public double getBalance(){
		return this.balance;
	}
}