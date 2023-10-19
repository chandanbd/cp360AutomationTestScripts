package assertion.Tests;
import org.junit.Assert;
public class TestAssertions {
	
	public void IsTrue(boolean value, String Message) {
		Assert.assertTrue(Message, value);
	}
	
	public void IsFalse(boolean value, String Message) {
		Assert.assertFalse(Message, value);
	}

}
