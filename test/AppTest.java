import junit.framework.*;

public class AppTest extends TestCase {
    public void test1() {
    }

    public void test2() {
        fail("test failed!");
    }
	
	 public void test3() {
        App app = new App();
		assertEqual(4,app.add(2,2));
    }
	
}
