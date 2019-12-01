package SecondMavenProject.SecondMavenProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	@BeforeSuite
	public void Test1()
	{
		System.out.println("@BeforeSuite");
	}
	@BeforeTest	
	public void Test2()
	{
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	public void Test3()
	{
		System.out.println("@BeforeClass");
	}
	@BeforeMethod
	public void Test4()
	{
		System.out.println("@BeforeMethod");
	}
	@Test
	public void Test5()
	{
		System.out.println("@Test1");
	}
	@Test
	public void Test6()
	{
		System.out.println("@Test2");
	}
	@Test
	public void Test7()
	{
		System.out.println("@Test3");
	}
	@AfterMethod
	public void Test8()
	{
		System.out.println("@AfterMethod");
	}
	@AfterClass
	public void Test9()
	{
		System.out.println("@AfterClass");
	}
	@AfterTest
	public void Test10()
	{
		System.out.println("@AfterTest");
	}
	
	@AfterSuite
	public void Test11()
	{
		System.out.println("@AfterSuite");
	}

}
