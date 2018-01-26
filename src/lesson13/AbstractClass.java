package lesson13;

public abstract class AbstractClass implements Interface {
    private int count;
    private int size;

    public AbstractClass(int size) {
        this.size = size;
    }

    @Override
    public void show() {
        System.out.println(count);
    }

    @Override
    public int start() {
        return 0;
    }

    @Override
    public int end() {
        return count;
    }

    @Override
    public void add() {
        count++;
    }
}
