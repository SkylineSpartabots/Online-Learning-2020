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
    public String run(int b) {
        return "aaa";
    }
}
