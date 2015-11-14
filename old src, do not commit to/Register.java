public class Register{
	
	private String file;
	
	public Register(){
		this.file = "journeys.txt";
	}
	
	public void setFileName(String fileName){
		this.file = fileName;
	}
	
	public String getFileName(){
		return this.file;
	}
}