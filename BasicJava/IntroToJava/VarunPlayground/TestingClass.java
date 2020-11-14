package VarunPlayground;

public class TestingClass extends TestAbstract implements TestInterface  {
    private int x;
    public TestingClass(int x) {
        this.x = x;
    }

    @Override
    public void testMethod() {

    }

    @Override
    public void run() {
        System.out.println(x + ";;;");
    }
}
