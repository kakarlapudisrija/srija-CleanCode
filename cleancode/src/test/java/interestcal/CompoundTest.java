package interestcal;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class CompoundTest {
	public void test() {
		Assert.assertEquals(1255.0881000000008,Compound_interest.compound_Interest(10000.0, 3.0, 4.0),0);
	}
}
