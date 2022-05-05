import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test start");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test succeeded");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test failed");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("Test failed but within success percentage");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("Started");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("Finished");
    }
}
