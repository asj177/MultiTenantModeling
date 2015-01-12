
public aspect task {
	// TODO Auto-generated aspect
	
	private  double Main.completionpercentage=70;
	private double Main.actualHours;
	
	pointcut task(Main m):call(public void Main.updateStatus())&&target(m);
	pointcut readTask(Main m):call(public void Main.getStatus())&&target(m);
	
	private void Main.updateActualHoursRemaning(double actualHours){
		
		
		
		System.out.println("Remaning hours left are  "+actualHours);
	}
	
	
	private void Main.getStatusrecord(){
		
		System.out.println("Completion percentage is  "+completionpercentage+"%");
	}
	
	
	
	after(Main m):task(m){
		
		m.updateActualHoursRemaning(9.0);
		
		
		
		
	}
	
	after(Main m):readTask(m){
		
		
		m.getStatusrecord();
		
	}
	
}
