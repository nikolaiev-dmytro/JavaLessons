package lesson11;

public class Container implements iContainer {
    private Enum type;
    private Object value;

    public Container() {
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public Enum getType() {
        return type;
    }
}
