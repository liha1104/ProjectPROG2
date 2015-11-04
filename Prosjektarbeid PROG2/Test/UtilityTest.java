import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class UtilityTest {

	@Test
	public void bitLength_normalString_shouldReturnCorrectLength() {
		assertThat(Utility.bitLength("0001"), is(4));
	}

	@Test
	public void nullLengthTest() {
		assertThat(Utility.bitLength(""), is(0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void tooLongLengthTest() {
		Utility.bitLength("1111111111111111111111111111111111111111111111111111111111111111");
	}
	
	
}
