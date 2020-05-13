import org.testng.annotations.Factory;

public class DataFactory {

    @Factory
    public Object[] mydata()
    {
        return new Object[]{
                new ClassLevelTest().method1()
        };
    }
}
