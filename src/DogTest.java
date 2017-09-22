import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {

	@Test
	public void test() {
		int cutenessTest;
		
		Dog test = new Dog("Luna", 1000, "modeling");
		cutenessTest = test.getCuteness();
		assertEquals(1000, cutenessTest);
	}

}
