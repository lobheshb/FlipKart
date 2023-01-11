package ListenersClasses;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClasse implements ITestListener
{
     public void onTestStart(ITestResult result)
     {
    	 System.out.println(result.getName()+ "Test Started");
     }
     
     public void onTestSuccess(ITestResult result)
     {
    	 System.out.println(result.getName()+ "Test Pass");
     }
     
     public void onTestFailure(ITestResult result)
     {
    	 System.out.println(result.getName()+ "Test Failure");
     }
     
     public void onTestSkipped(ITestResult result)
     {
    	 System.out.println(result.getName()+ "Test Skipped");
     }
     
     public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    System.out.println(result.getName()+ "Test Success Percentage");
	  }
     
     
     
     
     
}
