package SecondMavenProject.SecondMavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodTest {
	@Test(priority = 0, groups = {"sanity", "regression"})
	public void test1() {
		System.out.println("Test1");
	}

	@Test(priority = 1, dependsOnMethods = { "test1" }, groups = {"sanity", "regression"})
	public void test2() {
		System.out.println("Test2");
		Assert.assertTrue(false); // This will fail
	}

	@Test(priority = 2, dependsOnMethods = { "test1", "test2" }, groups = {"sanity", "regression"})
	public void test3() {
		System.out.println("Test3"); // This should not execute
	}

	@Test(groups = {"sanity"})
	public void test4() {
		System.out.println("Test4");
	}

	@Test(priority = 3, dependsOnMethods = { "test4" }, groups = {"sanity"})
	public void test5() {
		System.out.println("Test5"); // This should not execute
	}

	@Test
	public void test6() {
		System.out.println("Test6");
	}
}
