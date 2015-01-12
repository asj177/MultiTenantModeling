import java.util.Date;
import java.util.Scanner;


public class Main {
	
	private String name;
	private String cost;
	private Date startDate;
	private Date endDate;
	String workFlowtype;
	
	/*Main(String s){
		
		this.workFlowtype=s;
	}*/
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	public void updateStatus(){
		
	}
	
	public void getStatus(){
		
	}
	
	
	public static void main (String args[]){
			
		//Scanner in=new Scanner(System.in);
		//String projecttype=in.next();
		
		Main m=new Main();
		
		m.updateStatus();
		m.getStatus();
		
			
	}

}
