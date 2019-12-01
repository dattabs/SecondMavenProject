/*
 * package RetryAnalyzer; import org.testng.IRetryAnalyzer; import
 * org.testng.ITestResult;
 * 
 * public class IRetryAnalyzerEx implements IRetryAnalyzer { int counter = 0;
 * int retryLimit = 3; //Number of times the failed test cases will run
 * 
 * public boolean retry(ITestResult result) { if (counter < retryLimit) {
 * counter++; return true; } return false;
 * 
 * }
 * 
 * 
 * }
 */