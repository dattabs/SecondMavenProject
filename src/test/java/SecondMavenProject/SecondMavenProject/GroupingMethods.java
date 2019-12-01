package SecondMavenProject.SecondMavenProject;

import org.testng.annotations.Test;

public class GroupingMethods 
{
	@Test(groups = {"sanity", "regression"})
	public void Test1()
	{
		
	}
	@Test(groups = {"sanity"})
	public void Test2()
	{
		
	}
	@Test(groups = {"sanity", "regression"})
	public void Test3()
	{
		
	}
	@Test(groups = {"regression"})
	public void Test4()
	{
		
	}
	@Test(groups = {"regression"})
	public void Test5()
	{
		
	}
}
