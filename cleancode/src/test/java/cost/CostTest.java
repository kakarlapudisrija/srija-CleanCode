package cost;
import org.junit.Assert;
import org.junit.Test;
public class CostTest {
	public void test() {
		Assert.assertEquals(360000,Estimate_cost.estimation("high standard",200,"no"),0);
		Assert.assertEquals(500000,Estimate_cost.estimation("high standard",200,"yes"),0);
		Assert.assertEquals(600000,Estimate_cost.estimation("standard",500,"no"),0);
		Assert.assertEquals(450000,Estimate_cost.estimation("above standard",300,"no"),0);
	}
}
