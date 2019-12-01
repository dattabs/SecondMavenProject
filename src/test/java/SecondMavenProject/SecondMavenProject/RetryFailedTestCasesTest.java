package SecondMavenProject.SecondMavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedTestCasesTest 
{
	/*
	 * @Test(retryAnalyzer = RetryAnalyzer.IRetryAnalyzerEx.class) //Path of the
	 * RetryAnalyzer class public void Test1() { //This will fail and run for 4
	 * times (1 time normal execution & 3 times Retry Limit
	 * Assert.assertEquals(true, false); }
	 * 
	 * @Test(retryAnalyzer = RetryAnalyzer.IRetryAnalyzerEx.class) public void
	 * Test2() { //This will pass and run for 1 time Assert.assertEquals(true,
	 * true); }
	 */
	@Test
	public void Test3()
	{
		//This will fail and run for 1 time as the retryLogic is not implemented
		Assert.assertEquals(true, false); 
	}
	
	
}
