/**********************************
*	A class to represent a        *
*	journey taken by a user       *
*                                 *
***********************************/
import java.util.Scanner;
import java.io.*;
public class Journey{
	
	private Station startPoint;
	private Station endPoint;
	private double monthlyBalance;
	private Register register;
	private FileWriter out;
	
	public Journey(){
		this.startPoint = new Station();
		this.endPoint = new Station();
		this.monthlyBalance = 0.0;
	}
	
	public Journey(Station start, Station end, Register r ){
		this.startPoint = start;
		this.endPoint = end;
		this.monthlyBalance = 0.0;
		this.register = r;
		try{
		this.out = new FileWriter(register.getFileName(), true);
		}
		catch(IOException io){
		}
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
	
	public void addJourney(){
		String journey = "";
		journey = this.getStart().getStationName()+",";
		journey += this.getEnd().getStationName();
		
		try{
			this.out = new FileWriter(register.getFileName(), true);
			out.write("\r\n");
			out.write(journey);
			out.close();
		}
		catch(IOException io){
		}
	}
	
	public void addJourney(String s){
		
		try{
			this.out = new FileWriter(register.getFileName(), true);
			out.write("\r\n");
			out.write(s);
			out.close();
		}
		catch(IOException io){
			
		}
	}
	//helper print method for debugging
	public static <T> void p(T p){
		System.out.println(p);
	}
}