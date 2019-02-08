import org.junit.Test;
import org.junit.Assert;
public class MyTest {

    @Test
    public void name(){
        Assert.assertEquals("Hello World", HelloWorld.print());
    }

    @Test
    public void wrongOutputCheck(){
        Assert.assertEquals("Hello World!", HelloWorld.print());
    }

}
