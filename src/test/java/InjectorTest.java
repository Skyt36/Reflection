import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class InjectorTest  {
    @Test
    public void inject() {
        JustTest test = (new Injector<JustTest>()).inject(new JustTest());
        assertEquals("T1", test.getField1());
        assertEquals("T2", test.getField2());
    }
}