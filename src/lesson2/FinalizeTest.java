package lesson2;

public class FinalizeTest {
    private int x;

    FinalizeTest(int x) {
        this.x = x;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Dangerous: " + x);
        super.finalize();
    }
}
