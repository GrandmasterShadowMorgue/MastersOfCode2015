public class TESTAPP{
	
	public static void main(String [] args){
		Register regis = new Register();
		Station startStation = new Station("Picadilly Circus");
		Station endStation = new Station("Holborn");
		Journey journey = new Journey(startStation, endStation, regis);
		journey.setBalance(30.0);
		journey.addJourney();
		journey.addJourney(startStation.getStationName()+","+"some other station");
	}
}