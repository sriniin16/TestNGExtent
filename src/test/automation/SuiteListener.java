import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener {
    public void onStart(ISuite suite) {
        System.out.println("Isuitelistener starts here");
    }

    public void onFinish(ISuite suite) {
        System.out.println("Isuitelistener finsih here");
    }
}
