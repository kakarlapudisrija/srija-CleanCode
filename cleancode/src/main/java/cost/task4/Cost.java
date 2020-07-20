package cost.task4;

public class Cost {
	public static double estimation(String material,double area,String automate)
	 {
		 double totalcost=0.0;
		 if(material=="standard")
		 {
			 totalcost=area*1200;
		 }
		 else if(material=="above standard")
		 {
			 totalcost=area*1500;
		 }
		 else if(material=="high standard" && automate=="no")
		 {
			totalcost=area*1800; 
		 }
		 else if(material=="high standard" && automate=="yes")
		 {
			 totalcost=area*2500;
		 }
		 return totalcost;
	 }
}
