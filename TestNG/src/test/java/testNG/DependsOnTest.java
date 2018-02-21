package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTest {

	@Test(groups={"sanity","regression"})

	public void login() {
		
		System.out.println("groups={sanity,regression}");
		
		Assert.assertTrue(false);

	}

	@Test(dependsOnMethods={"login"})

	public void test2() {

		System.out.println("groups={sanity,database}");
	}
	

	
	@Test(dependsOnMethods={"login"})

	public void logout() {

		System.out.println("groups={sanity,database}");
		Assert.assertTrue(false);
	}
}
