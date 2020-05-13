import org.testng.TestListenerAdapter;
import org.testng.annotations.DataProvider;

public class data  {

    public static String data = "mydata";

    @DataProvider(name = "mydata")
    public static Object[][] getdata()
    {
        return new Object[][]{
                {data}
        };
    }
}
