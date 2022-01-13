import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitQuickcheck.class)
public class StringOpsTest {
	
	/**
	 * Property to test: If lengths of s1 and s2 are different,
	 *                   StringOps.equals(s1, s2) returns false. 
	 * 
	 * @param s1 First string
	 * @param s2 Second string
	 */
	@Property(trials = 1000)
	public void testEquals(String s1, String s2) {
		// System.out.println("testEquals s1='" + s1 + "', s2='" + s2 + "'");
		// TODO: Fill in.
	}

	/**
	 * Property to test: StringOps.isValidHTML(s) returns true for all strings
	 * generated by the ValidHTMLStringGenerator.
	 * 
	 * @param s1 First string
	 * @param s2 Second string
	 */
	@Property(trials = 1000)
	public void testIsValidHTMLTrue(@From(ValidHTMLStringGenerator.class) String s) {
		// System.out.println("testIsValidHTMLTrue s='" + s + "'");
		assertTrue(StringOps.isValidHTML(s));
	}
}
