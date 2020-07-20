package interest.task4;

public class Compound {
	public static double compound_Interest(double amount,double rate,double time)
	{
		return amount*Math.pow((1+rate/100.0),time)-amount;
	}
}
