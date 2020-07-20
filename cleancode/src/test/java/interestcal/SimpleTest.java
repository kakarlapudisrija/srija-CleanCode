package interestcal;
import org.junit.Assert;
import org.junit.Test;
public class SimpleTest {
	public void test() {
		Assert.assertEquals(1200.0,Simple_interest.simple_Interest(10000.0, 3.0, 4.0),0);
	}
}
