/**********************************
*	A class to represent a        *
*	Station that is a start       *
*   or an endpoint.               *
***********************************/

public class Station{
	
	private String nameOfStation;
	
	public Station(String name){
		this.nameOfStation = name;
	}
		
	public Station(){
		this.nameOfStation = "";
	}
	
	public void setStationname(String name){
		this.nameOfStation = name;
	}
	
	public String getStationName(){
		return this.nameOfStation;
	}
}